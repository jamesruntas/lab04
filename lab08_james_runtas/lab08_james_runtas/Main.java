import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * SYSC2004 Summer 2023 Lab 8
 * Main class responsible for user interaction and data management of user profiles.
 * 
 * 
 * @author James Runtas 
 * Student Number 101109175
 * @version Version 1.00 July 27th 2023
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
        profile.setProfilePassword(iPassword); //Will hash it 


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
        Scanner userInput = new Scanner(System.in); 
        try {
            while(!quit){
                userInputProfile(userInput);
                System.out.println("Enter Q to quit, L to login or any key to add another user");
                String iUserQuitOrAddMore = userInput.nextLine();

                //Entered Q?
                if (iUserQuitOrAddMore.equalsIgnoreCase("Q")){
                    // Print all user profiles
                    for (HashMap.Entry<String, Profile> user: users.entrySet()){
                        user.getValue().printProfile();
                    }
                    quit = true;
                }
                //Entered L?
                else if (iUserQuitOrAddMore.equalsIgnoreCase("L")) {
                    login(userInput);
                }
            }

        }catch (Exception e) {
            System.out.println("IO error");
        }
        finally {
            // Make sure to close the Scanner when done
            userInput.close();
        }
    }

    /**
     * Prompts user username and login. will check if correct inputs, either refusing login or logging in successfully.
     * @param userInputLogin The Scanner object used for user input.
     */
    private static void login(Scanner userInputLogin) {

        //Get Username from user
        System.out.println("Enter username: ");
        String iUserName = userInputLogin.nextLine();

        //Look for if username exists in our DB.
        Profile profile = users.get(iUserName);
        
        //If no username, print out and return to main
        if (profile == null) {
            System.out.println("No user found with that username.");
        } else {
            for (int i = 0; i < 3; i++) { //If username does exist, we set 3 password attempts
                System.out.println("Enter password: ");
                String iPassword = userInputLogin.nextLine(); //Poll user for password

                if (profile.checkPassword(iPassword)) { //if the usernames password (hashed) matches entered password(hashed), see checkPassword()
                    System.out.println("Login successful.");
                    profile.printProfile();
                    return;
                } else {
                    System.out.println("Invalid password. Try again.");
                }
            }

            System.out.println("Max number of wrong attempts reached!");
        }

    }
}
