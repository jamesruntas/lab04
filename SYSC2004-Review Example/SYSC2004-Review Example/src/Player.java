import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 * Class to be used to assign a pokemon to a player based on
 * which generation they are looking for.
 *
 * @author Dr. Rami Sabouni
 * @version 1.2 last edited August 16th, 2023
 */
public class Player extends Pokemon {
    private int generation;

    /**
     * HashMap to store the chosen pokemon character for a player.
     */
    private HashMap<String, Object> pokemon;

    /**
     * Overloaded constructor to prepare the class to be used.
     * @param fileName the name of the file that contains a pokemon's details.
     * @param generation the pokemon's generation that the player is expected
     *                   to generate a pokemon from.
     */
    public Player(String fileName, int generation) {
        super(fileName);
        this.generation = generation;
    }

    /**
     * Read the csv file and fill in the class's pokemonList ArrayList with only the
     * pokemons that match the class's generation.
     */
    @Override
    public void readFile() {
        int lineCount = 0;
        try {
            File fileObject = new File(fileName);
            Scanner inFile = new Scanner(fileObject);
            while (inFile.hasNextLine()) {
                if (lineCount == 0) {
                    header = inFile.next().split(",");
                } else {
                    String[] line = inFile.next().split(",");
                    if (line[8].equals(Integer.toString(generation))) {
                        HashMap<String, Object> tempMap = new HashMap<>();
                        for (int i = 0; i < header.length; i++) {
                            tempMap.put(header[i], line[i]);
                        }
                        pokemonList.add(tempMap);
                    }
                }
                lineCount++;
            }
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /**
     * Randomly choose a Pokemon and assign it to the player.
     */
    public void getPlayer() {
        Random random = new Random();
        pokemon = pokemonList.get(random.nextInt(0, pokemonList.size()));
    }

    @Override
    public void printPokemons() {
        // get the set of keys from the HashMap then convert it into an array to be sorted
        String[] attributes = new String[pokemonList.get(0).keySet().size()];
        pokemonList.get(0).keySet().toArray(attributes);
        Arrays.sort(attributes);

        // Print out the head of the table
        System.out.println(" " + "_".repeat(107));
        for (int i = 0; i < attributes.length; i++) {
            System.out.printf("|%10s\t", attributes[i]);
        }

        // Print out the body of the table
        System.out.println("|\n|" + "-".repeat(107) + "|");
        for (int i = 0; i < attributes.length; i++) {
            System.out.printf("|%10s\t", pokemon.get(attributes[i]));
        }
        System.out.println("|\n|" + "-".repeat(107) + "|");
    }
}
