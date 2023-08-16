import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Class to be used to create a list of Pokemons read from a csv file.
 *
 * @author Dr. Rami Sabouni
 * @version 1.2 last edited August 16th, 2023
 */
public class Pokemon {
    /**
     * The value's type is an Object to allow us to associate different types to
     * the value based on what is read from the file.
     */
    protected ArrayList<HashMap<String, Object>> pokemonList;
    protected final String fileName;
    protected String[] header = {""};

    /**
     * Default constructor to set
     */
    public Pokemon(){
        this.fileName = "";
    }

    /**
     * Overloaded constructor to prepare the class to be used.
     * @param fileName the name of the file that contains a pokemon's details.
     */
    public Pokemon(String fileName){
        this.fileName = fileName;
        pokemonList = new ArrayList<HashMap<String, Object>>();
    }

    /**
     * Read the csv file and fill in the class's pokemonList ArrayList will all read
     * pokemon details
     */
    public void readFile(){
        int lineCount = 0;
        try {
            File fileObject = new File(fileName);
            Scanner inFile = new Scanner(fileObject);
            while (inFile.hasNextLine()) {
                if (lineCount == 0){
                    header = inFile.next().split(",");
                }else {
                    String[] line = inFile.next().split(",");
                    HashMap<String, Object> tempMap = new HashMap<>();
                    for (int i = 0; i < header.length; i++){
                        if (!(i == 0 || i == 6 || i == 7)){
                            tempMap.put(header[i], Integer.parseInt(line[i]));
                        }else{
                            tempMap.put(header[i], line[i]);
                        }
                    }
                    pokemonList.add(tempMap);
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
     * Output the all pokemons' details
     */
    public void printPokemons(){
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
        for (Map<String, Object> pokemon: pokemonList){
            for (int i = 0; i < attributes.length; i++) {
                System.out.printf("|%10s\t", pokemon.get(attributes[i]));
            }
            System.out.println("|");
        }
        System.out.println("|"+"-".repeat(107) + "|");
    }

    /**
     * Method to be used by the derived class
     */
    public void getPlayer() {
    }
}
