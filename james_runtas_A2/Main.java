/**
 * Main client used for creating Car Engine objects.
 *
 * @author James Runtas
 * Student Number 101109175
 * @version Version 1.0 July 29th 2023
 *
 * SYSC2004 Summer 2023 Assignment 2
 */

import java.util.ArrayList;

public class Main {

    /**
     * The main entry point for the program.
     * Creates a list of CarEngine objects and prints their details.
     *
     * @param args the command-line arguments
     */
    public static void main (String[] args){
        ArrayList<CarEngine> engines = new ArrayList<>();

        // Create CarEngine objects and add them to the list.
        // We assume CarEngine has a constructor that takes these parameters in the following order:
        // Company name, torque, speed, bore size, stroke, number of cylinders
        engines.add(new CarEngine("Ford", 100, 500, 80, 90, 5));
        engines.add(new CarEngine("Honda", 500, 2000, 40, 120, 8));
        engines.add(new CarEngine("Yamaha", 200, 1000, 120, 50, 2));
        engines.add(new CarEngine("Can-Am", 150, 5000, 50, 92, 4));
        engines.add(new CarEngine("Toyota", 200, 4000, 30, 54, 6));

        // Print the details of each engine
        printEngineDetails(engines);
    }

    /**
     * Iterates over a list of CarEngine objects and prints their details.
     *
     * @param engines the list of CarEngine objects
     */
    public static void printEngineDetails(ArrayList<CarEngine> engines) {
        for (CarEngine engine : engines) {
            // Print the details of the current engine
            System.out.println("Company Name: " + engine.getCompanyName());
            System.out.println("Number of Cylinders: " + engine.getNumCylinders());
            System.out.println("Engine Displacement: " + engine.getEngineDisplacement());
            System.out.println("Horse Power: " + engine.getHorsePower());
            System.out.println();
        }
    }
}
