package lab07_james_runtas;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.time.LocalDate;

/**
 * SYSC2004 Summer 2023 Lab 7
 * Profile class representing a users profile. 
 * 
 * 
 * @author James Runtas 
 * Student Number 101109175
 * @version Version 1.00 July 24th 2023
 */
public class Profile {

    private LocalDateTime lastLogged;
    private boolean loggedIn;
    private String profilePassword;
    private String userName;
    private LocalDate dateOfBirth;
    private String lastName;
    private String firstName;
    
    /**
     * Constructor for Profile. Initializes the profile with default values.
     */
    public Profile() {
        firstName = "Default First";
        lastName = "Default Last";
        dateOfBirth = LocalDate.of(2023,01,01);
        profilePassword = "Default Password";
        setUserName(firstName + lastName);
        loggedIn = false; 
        lastLogged = LocalDateTime.now();
    }

    /**
     * Prints profile information to the console.
     */
    public void printProfile() {
        System.out.println("Username: " + this.userName);
        System.out.println("Name: " + firstName);
        System.out.println("D.O.B: " + dateOfBirth);
        System.out.println("Last Logged in: " + lastLogged);
        System.out.println("-----------------");
    }

    /**
     * Checks if entered password matches the profile password.
     * @param enteredPassword The entered password.
     * @return True if the password matches, otherwise false.
     */
    public boolean checkPassword(String enteredPassword) {
        if (enteredPassword.equals(profilePassword)){
            setLoggedIn(true);
            return true;
        }
        setLoggedIn(false);
        return false;
    }

    // Getters...

    /**
     * Sets logged in status.
     * @param loggedIn The new logged in status.
     */
    private void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    /**
     * Sets the date of birth. Date must be in "yyyy-MM-dd" format.
     * @param date The new date of birth.
     */
    public void setDateOfBirth(String date) {
        try {
            this.dateOfBirth = LocalDate.parse(date);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use 'yyyy-MM-dd'");
        }
    }

    // Other setters...

    /**
     * Sets the last name of the profile and updates the username.
     * @param lastName The new last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
        setUserName(firstName + lastName);
    }

    /**
     * Sets the first name of the profile and updates the username.
     * @param firstName The new first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        setUserName(firstName + lastName);
    }
}
