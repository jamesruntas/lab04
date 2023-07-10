import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * 
 * @author James Runtas 
 * Student Number 101109175
 * @version Version 1.00 July 17th 2023
 * 
 * SYSC2004 Summer 2023 Assignment 1
 */

public class Main {
 public static void main(String[] args) throws IOException{

        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("Enter Project Name");
            String iName = userInput.nextLine();  // Read user input
            System.out.println("Enter Height");
            float iHeight = userInput.nextFloat();  // Read user input
            System.out.println("Enter Width");
            float iWidth = userInput.nextFloat();  // Read user input
            System.out.println("Enter Length");
            float iLength = userInput.nextFloat();  // Read user input
            System.out.println("Enter Price per can");
            float iCanPrice = userInput.nextFloat();  // Read user input
            System.out.println("Enter Project Budget");
            float iBudget = userInput.nextFloat();  // Read user input


            PaintJob myPaintJob = new PaintJob(iName,iHeight,iWidth, iLength);

            myPaintJob.setBudget(iBudget);

            System.out.println("Wall Area: " + myPaintJob.getArea() + "ft^2\n");

            myPaintJob.calculateCoatCoast(iCanPrice, iBudget);
        }
        catch(Exception e){
            System.out.println("IO error");
        }
    } 
    
    
}
