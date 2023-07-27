import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

import java.time.LocalDate;
import java.math.BigInteger;
import java.security.*;

/**
 * SYSC2004 Summer 2023 Lab 8
 * Profile class creates user profiles
 * 
 * @author James Runtas 
 * Student Number 101109175
 * @version Version 1.00 July 27th 2023
 */
public class Profile {

    private LocalDateTime lastLogged;
    private boolean loggedIn;
    private String profilePassword;
    private String userName;
    private LocalDate dateOfBirth;
    private String lastName;
    private String firstName;
    private MessageDigest md;
    
    /**
     * Constructor for Profile. Initializes the profile with default values.
     */
    public Profile() {
        firstName = "Default First";
        lastName = "Default Last";
        dateOfBirth = LocalDate.of(2023,01,01);
        setProfilePassword("Default Password"); //Hashing default password. cant store unencrypted passwords
        setUserName(firstName+lastName);
        loggedIn = false; 
        lastLogged = LocalDateTime.now();
    }

    /**
     * Takes a password and creates its SHA256 Hash
     * @param profilePassword The entered password.
     * @return Hashed Password, or throws an error. 
     */
    private String hashText(String profilePassword){
        //Create instance of MessageDigest SHA256
        //Must be surrounded by try catch to compile.
        try {
            md = MessageDigest.getInstance("SHA-256");
            byte[] messageDigest = md.digest(profilePassword.getBytes()); //use input parameter
            BigInteger messageNumber = new BigInteger(1, messageDigest);
            String hashText = messageNumber.toString(16);
    
            while(hashText.length() < 64){
                hashText = "0" + hashText;
            }
            return hashText;
    
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    /*
     * Prints user profile information to console
     */
    public void printProfile() {
        System.out.println("Username: " + this.userName);
        System.out.println("Name: " + firstName + " " + lastName);
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
        if (hashText(enteredPassword).equals(profilePassword)){ //compare hashes
            setLoggedIn(true);
            return true;
        }
        setLoggedIn(false);
        return false; // Return the correct value after implementation
    }

    /*
     * Retrieve log in time
     */
    public LocalDateTime getLastLogged() {
        return lastLogged;
    }

    /*
     * Retrieve user password
     */
    public String getProfilePassword() {
        return profilePassword;
    }

    /*
     * Retrieve user name
     */
    public String getUserName() {
        return userName;
    }

    /*
     * Retrieve user date of birth
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /*
     * Retrieve user last name
     */
    public String getLastName() {
        return lastName;
    }

    /*
     * Retrieve user first name
     */
    public String getFirstName() {
        return firstName;
    }

    /*
     * Set the user to logged in status 
     * @param loggedIn the flag of current logged in status
     */
    private void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;

        if(loggedIn){ //if user is logged in, update last logged time to current time. 
            setLastLogged();
        }
        
    }

    /*
     * Set the user DOB 
     * @param date as a string converted to date object.
     */
    public void setDateOfBirth(String date) {
        try {
            this.dateOfBirth = LocalDate.parse(date);
        } catch (DateTimeParseException e) {
            this.dateOfBirth = null;
            System.out.println("Invalid date format. Please use 'yyyy-MM-dd'");
        }
    }

    /*
     * Set user logged in to current new time
     */
    private void setLastLogged() {
        lastLogged = LocalDateTime.now();
    }

    /*
     * Set user pass
     * @param profilePassword
     */
    public void setProfilePassword(String profilePassword) {
        this.profilePassword = hashText(profilePassword);
    }

    /*
     * Set user name
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /*
     * Set last name
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
        setUserName(firstName+lastName);
    }

    /*
     * Set first name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        setUserName(firstName+lastName);
    }
}