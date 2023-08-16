/**
 * This project is used as a review exercise for SYSC2004
 * The project is supposed to cover the following topics:
 *  - Inheritance
 *  - Polymorphism
 *  - Random Class
 *  - Try/Catch
 *  - File input
 *  - HashMaps
 *  - ArrayLists
 *  - JavaDocs
 *  - Integer to String conversion
 *  - String to Integer conversion
 *  - printf method.
 *
 * @author Dr. Rami Sabouni
 * @version 1.2 last edited August 16th, 2023
 */
public class Main {
    /**
     * Main entry point to the application
     * @param args input arguments
     */
    public static void main(String[] args) {
        Pokemon game = new Pokemon("pokemon.csv");
        game.readFile();
        game.getPlayer();
        game.printPokemons();

        Pokemon player = new Player("pokemon.csv", 4);
        player.readFile();
        player.getPlayer();
        player.printPokemons();
    }
}