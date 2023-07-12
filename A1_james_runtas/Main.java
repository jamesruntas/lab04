import java.io.IOException;
import java.util.Scanner;

/**
 * SYSC2004 Summer 2023 Assignment 1
 * Main Class and 'client'.creates a painting project using the classes overloaded constructor
 * by prompting the user to enter input variables for the project. 
 * These values are passed into the paintjob class.
 * 
 * @author James Runtas 
 * Student Number 101109175
 * @version Version 1.00 July 17th 2023
 * 
 */
public class Main {
    public static void main(String[] args) throws IOException{ 
        //main client throws IOException because we are using Scanner. 

        //Try to create a scanner object, ensure user input works.
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("Enter Project Name: ");
            String iName = userInput.nextLine();  // Read user input, project name
            System.out.println("Enter Height: (feet) ");
            float iHeight = userInput.nextFloat();  // Read user input, project height
            System.out.println("Enter Width: (feet)");
            float iWidth = userInput.nextFloat();  // Read user input, project width
            System.out.println("Enter Length: (feet)");
            float iLength = userInput.nextFloat();  // Read user input, project length
            System.out.println("Enter Price per can: ($)");
            float iCanPrice = userInput.nextFloat();  // Read user input, paint can price
            System.out.println("Enter Project Budget: ($)");
            float iBudget = userInput.nextFloat();  // Read user input, project budget.

            //Create PaintJob object with name and dimensions entered by user.
            PaintJob myPaintJob = new PaintJob(iName,iHeight,iWidth, iLength);

            //use object setter for user inputed budget as it is a private attribute.
            myPaintJob.setBudget(iBudget);

            //Print the result of the area getter. area is a private attribute.
            System.out.println("Wall Area: " + myPaintJob.getArea() + "ft^2\n");

            //Call the project calculation method on the paintJob object with the user inputted paint price and budget.
            myPaintJob.calculateCoatCoast(iCanPrice, iBudget);
        }
        //Scanner Try statement encountered error.
        catch(Exception e){
            System.out.println("IO error");
        }
    } 
    
    
}
