/**
 * Main class to create a heater object, displaying the objects temperature as well as testing increment and decrement (warm, cool)
 * 
 * 
 * @author James Runtas 
 * Student Number 101109175
 * @version Version 1.03 July 10th 2023
 * 
 * SYSC2004 Summer 2023 Lab 3
 */


public class Main {
    public static void main(String[] args) {

        System.out.println("Starting Main, Heater being created\n");
        
        Heater heater1 = new Heater();   //Create default heater object

        System.out.println(heater1.temperature());   //display initital temp

        heater1.warmer();   // call warm method to increment heater temp

        System.out.println(heater1.temperature()); //dispay warmer temp
        
        heater1.cooler();   //call cooler method to decrement heater temp
        
        System.out.println(heater1.temperature());  // display cooler temp
    }
}
