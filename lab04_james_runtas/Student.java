import java.io.IOException;
import java.util.Scanner;

/**
 * SYSC2004 Summer 2023 Lab 4
 * Student Class. A subclass of Person that contains additional attributes.
 * Implements the abstract method userInput.
 * 
 * Author: James Runtas
 * Student Number: 101109175
 * Version: 1.00
 * Date: July 14th, 2023
 */
public class Student extends Person {

    private Boolean regType, studentType;
    private Double GPA;
    private String departmentName;

    /**
     * Default constructor that initializes the instance variables with default values.
     */
    public Student() {
        super();
        firstName = "StudentFirst";
        lastName = "StudentLast";
        departmentName = "DefaultDepartment";
        GPA = 4.0;
        studentType = true;
        regType = true;
        personType = false;
    }

    /**
     * Constructor that allows specifying attribute values.
     * 
     * @param ifirstName      The first name of the student.
     * @param ilastName       The last name of the student.
     * @param idepartmentName The department name of the student.
     * @param istudentType    Indicates if the student is an undergraduate or graduate.
     * @param iGPA            The GPA of the student.
     * @param iregType        Indicates if the student is full-time or part-time.
     */
    public Student(String ifirstName, String ilastName, String idepartmentName, Boolean istudentType, Double iGPA, Boolean iregType) {
        firstName = ifirstName;
        lastName = ilastName;
        departmentName = idepartmentName;
        studentType = istudentType;
        GPA = iGPA;
        regType = iregType;
    }

    /**
     * Overrides the userInput method from the Person class to handle student-specific user input.
     */
    @Override
    public void userInput() {
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("Enter first name: ");
            String iFirstName = userInput.nextLine();
            System.out.println("Enter last name: ");
            String iLastName = userInput.nextLine();
            System.out.println("Enter age: ");
            int iAge = userInput.nextInt();
            System.out.println("Enter true for faculty or false for student: ");
            Boolean iPersonType = userInput.nextBoolean();
            System.out.println("Enter department name: ");
            String iDepartmentName = userInput.nextLine();
            System.out.println("Enter GPA: ");
            float iGPA = userInput.nextFloat();
            System.out.println("Enter true for undergraduate or false for graduate: ");
            Boolean iStudentType = userInput.nextBoolean();
            System.out.println("Enter true for FULL TIME or false for PART TIME: ");
            Boolean iRegType = userInput.nextBoolean();

        } catch (Exception e) {
            System.out.println("IO error");
        }
    }

    /**
     * Overrides the printInfo method from the Person class to display student-specific information.
     */
    @Override
    public void printInfo() {
        System.out.println("Welcome to SYSC2004 Lab 04");
        System.out.println("Apparently you are a student!");
        System.out.println("Your name is: " + firstName + " " + lastName);
        System.out.println("You are " + age + " years old");
        System.out.println("Student is in " + departmentName + " and their GPA is " + GPA);
        if (regType == true && studentType == true) {
            System.out.println("Student is a full-time undergraduate student");
        } else if (regType == true && studentType == false) {
            System.out.println("Student is a full-time graduate student");
        } else if (regType == false && studentType == true) {
            System.out.println("Student is a part-time undergraduate student");
        } else if (regType == false && studentType == false) {
            System.out.println("Student is a part-time graduate student");
        }
    }
}