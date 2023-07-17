/**
 * SYSC2004 Summer 2023 Lab 4
 * Faculty Class. A subclass of Person that contains additional attributes.
 * 
 * Author: James Runtas
 * Student Number: 101109175
 * Version: 1.00
 * Date: July 14th, 2023
 */
public class Faculty extends Person {
    
    private Boolean contractType;
    private String departmentName;

    /**
     * Constructor that allows specifying attribute values.
     * 
     * @param ifirstName       The first name of the faculty member.
     * @param ilastName        The last name of the faculty member.
     * @param idepartmentName  The department name of the faculty member.
     * @param icontractType    Indicates if the faculty member has a contract.
     */
    public Faculty(String ifirstName, String ilastName, String idepartmentName, Boolean icontractType) {
        firstName = ifirstName;
        lastName = ilastName;
        departmentName = idepartmentName;
        contractType = icontractType;
    }

    /**
     * Default constructor that initializes the instance variables with default values.
     */
    public Faculty() {
        super();
        firstName = "FacultyFirst";
        lastName = "FacultyLast";
        departmentName = "DefaultDepartment";
        contractType = true;
        personType = true;
    }

    /**
     * Empty implementation of the userInput method inherited from the Person class.
     */
    public void userInput() {
        // Empty method body
    }

    /**
     * Overrides the printInfo method from the Person class to display faculty-specific information.
     */
    public void printInfo() {
        System.out.println("Welcome to SYSC2004 Lab 04");
        System.out.println("Apparently you are a faculty!");
        System.out.println("Your name is: " + firstName + " " + lastName);
        System.out.println("You are " + age + " years old");
        System.out.println("Faculty is in " + departmentName);
        if (contractType == true) {
            System.out.println("Faculty is a full-time member");
        } else {
            System.out.println("Faculty is a contract instructor");
        }
    }
}
