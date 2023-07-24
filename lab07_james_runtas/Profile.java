package lab07_james_runtas;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class Profile {

    private LocalDateTime lastLogged;
    private boolean loggedIn;
    private String profilePassword;
    private String userName;
    private LocalDate dateOfBirth;
    private String lastName;
    private String firstName;
    
    public Profile() {
    }

    public void printProfile() {
        // Implement the functionality here
    }

    public boolean checkPassword(String enteredPassword) {
        // Implement the functionality here
        return false; // Return the correct value after implementation
    }

    public LocalDateTime getLastLogged() {
        return lastLogged;
    }

    public String getProfilePassword() {
        return profilePassword;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public void setDateOfBirth(String date) {
        // Parse the date string into LocalDate here and set
    }

    private void setLastLogged() {
        // Implement the functionality here
    }

    public void setProfilePassword(String profilePassword) {
        this.profilePassword = profilePassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}