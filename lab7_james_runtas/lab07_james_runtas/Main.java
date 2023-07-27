package lab07_james_runtas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Main class responsible for user interaction and data management.
 */
public class Main {
    /** A map to store user profiles, keyed by username. */
    public static Map<String, Profile> users = new HashMap<>();

    /**
     * Prompts user for profile information and creates a new Profile object.
     * @param userInput The Scanner object used for user input.
     */
    public static void userInputProfile(Scanner userInput) {
        System.out.println("Enter first name: ");
        String iFirstName = userInput.nextLine();
        System.out.println("Enter last name: ");
        String iLastName = userInput.nextLine();
        System.out.println("Enter Date of birth (YYYY-MM-DD): ");
        String iDateOfBirth = userInput.nextLine();
        System.out.println("Enter password: ");
        String iPassword = userInput.nextLine();
       
        // Create new profile object
        Profile profile = new Profile();
        profile.setFirstName(iFirstName);
        profile.setLastName(iLastName);
        profile.setDateOfBirth(iDateOfBirth);
        profile.setProfilePassword(iPassword);

        // Add to the users HashMap
        users.put(iFirstName + iLastName, profile);
    }

    /**
     * The main method. Handles user interaction loop and program termination.
     * @param args The command line arguments.
     */
    public static void main(String[] args){
        Boolean quit = false;
        try (Scanner userInput = new Scanner(System.in)) {
            while(!quit){
                userInputProfile(userInput);
                System.out.println("Enter Q to quit the app or any key to add another user");
                String iUserQuitOrAddMore = userInput.nextLine();

                if (iUserQuitOrAddMore.equalsIgnoreCase("Q")){
                    // Print all user profiles
                    for (HashMap.Entry<String, Profile> user: users.entrySet()){
                        user.getValue().printProfile();
                    }
                    quit = true;
                }
            }
        }catch (Exception e) {
            System.out.println("IO error");
        }
    }
}
