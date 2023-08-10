/**
 * Main client method that implements shipping container objects as well as the text UI. 
 *
 * @author James Runtas
 * Student Number 101109175
 * @version Version 1.0 August 10th 2023
 *
 * SYSC2004 Summer 2023 Assignment 3
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    private static ArrayList<ShipContainer> containerList = new ArrayList<>(); //List of all containers 

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            displayMenu(); //Text UI 

            String choice = scanner.nextLine().toUpperCase();  //Read upper and lower case. 

            //Look to see if user entered correct choices
            switch (choice) {
                case "M":
                    System.out.println("Enter contents for the manual container:");
                    String manualContents = scanner.nextLine(); //Contents
                    ManualContentList manualContainer = new ManualContentList();
                    manualContainer.setContents(manualContents); //Add contents to new ManualContainer
                    containerList.add(manualContainer); //Add ManualContainer to container list
                    break;

                case "R":
                    System.out.println("Enter an item for the RFID container:");
                    String rfidContents = scanner.nextLine(); //Contents
                    ShippingContainerRFID rfidContainer;

                    // Check if there's already an RFID container created in the current session.
                    if (containerList.size() > 0 && containerList.get(containerList.size() - 1) instanceof ShippingContainerRFID) {
                        // If one exists, use that container.
                        rfidContainer = (ShippingContainerRFID) containerList.get(containerList.size() - 1);
                    } else {
                        // Otherwise, create a new RFID container.
                        rfidContainer = new ShippingContainerRFID(1); // Placeholder, as we'll set the actual ID next
                        rfidContainer.setContainerID(rfidContainer.getContainerID() + 1);
                        containerList.add(rfidContainer); //Add to container list
                    }
                    rfidContainer.setContents(rfidContents); // Add the inputted item to the RFID container.
                    break;

                case "P":
                    System.out.println("Printing container contents:"); // print the contents of all containers in the list.
                    for (ShipContainer container : containerList) {
                        container.printContent();
                    }
                    break;

                case "Q": //Close the program and scannner
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default://invalid user input, returns to start of while loop
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    /*
     * Method that displays the UI and its options
     * Runs after each iteration of one of the selections (except for Q)
     */
    public static void displayMenu() {
        System.out.println("\nChoose an option:");
        System.out.println("M - Enter Manual Content");
        System.out.println("R - Enter RFID Content");
        System.out.println("P - Print Containers");
        System.out.println("Q - Quit");
        System.out.print("Your choice: ");
    }


}

