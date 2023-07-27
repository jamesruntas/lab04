import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * SYSC2004 Summer 2023 Lab 7
 * Main class responsible for user interaction and data management of user profiles.
 * 
 * 
 * @author James Runtas 
 * Student Number 101109175
 * @version Version 1.00 July 25th 2023
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

        // Check if date of birth was correctly set
        if (profile.getDateOfBirth() != null) {
            // Add to the users HashMap
            users.put(iFirstName + iLastName, profile);
        } else {
            System.out.println("User was not added due to invalid date of birth.");
        }
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
