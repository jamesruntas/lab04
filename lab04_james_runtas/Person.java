/**
 * SYSC2004 Summer 2023 Lab 4
 * Person Class.
 * 
 * This class represents a person and serves as an abstract base class for subclasses.
 * 
 * Constructors:
 * - Person(): Default constructor that initializes the instance variables with default values.
 * 
 * Abstract method:
 * - userInput(): This method is meant to be overridden by subclasses to handle user input.
 * 
 * Instance variables:
 * - personType: Indicates the type of person (student or teacher).
 * - age: The age of the person.
 * - firstName: The first name of the person.
 * - lastName: The last name of the person.
 * 
 * Methods:
 * - printInfo(): Prints information about the person, such as their name, age, and person type.
 * 
 * Author: James Runtas
 * Student Number: 101109175
 * Version: 1.00
 * Date: July 14th, 2023
 */

 
public abstract class Person {
    protected Boolean personType;
    protected int age;
    protected String firstName;
    protected String lastName;

    /**
     * Default constructor that initializes the instance variables with default values.
     */
    public Person() {
        firstName = "DefaultFirst";
        lastName = "DefaultLast";
        age = 0;
        personType = false;
    }

    /**
     * Abstract method to be overridden by subclasses to handle user input.
     */
    public abstract void userInput();

    /**
     * Prints information about the person, such as their name, age, and person type.
     */
    public void printInfo() {
        System.out.println("Welcome to SYSC2004 Lab 04");
        System.out.println("Apparently you are a person!");
        System.out.println("Your name is: " + firstName + " " + lastName);
        System.out.println("You are " + age + " years old");
        if (personType == false) {
            System.out.println("You are a Student");
        } else {
            System.out.println("You are a Teacher");
        }
    }
}