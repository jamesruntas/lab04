/**
 * A Heater models a simple space-heater. The operations provided by a Heater
 * object are:
 * 1. Increase and decrease the temperature setting by a set amount.
 * 2. Return the current temperature setting.
 * 3. Change the set amount by which the temperature is increased and lowered.
 * 
 * @author L.S. Marshall, SCE, Carleton University
 * (incomplete implementation for SYSC 2004 Lab 2)
 * 
 * @author James Runtas 
 * Student Number 101109175
 * @version Version 1.03 July 18th 2023
 * 
 * SYSC2004 Summer 2023 Lab 5
 */
public class Heater{
    /** The temperature setting that the heater should maintain. */
    private int temperature;
    
    /** The temperature setting for a newly created heater. */
    private static final int INITIAL_TEMPERATURE = 15;
    
    /** 
     * The amount by which the temperature setting is raised/lowered when
     * warmer() and cooler() are invoked.
     */
     private int increment;
    
    /** 
     * The default amount by which the temperature setting is 
     * increased when warmer() is invoked and decreased when cooler()
     * is invoked.
     */
    private static final int DEFAULT_INCREMENT = 5;
    
    /**
     * Constructs a new Heater with an initial temperature setting of 15
     * degrees, and which increments and decrements the temperature
     * setting in increments of 5 degrees.
     */
    public Heater(){
        temperature = INITIAL_TEMPERATURE;
        increment = DEFAULT_INCREMENT;
    }
 
    /**
     * @param minTemp
     * @param maxTemp
     * 
     * Constructs a new heater with a minimum temperature and maximum temperature.
     * 
     */    
    public Heater(int minTemp, int maxTemp) {
    }

    /**
     * Returns heater objects current temperature (int)
     */    
    public int temperature(){
        return temperature;
    }
    
    /**
     * Increment the heaters temperature by the increment value (warm up)
     */
    public void warmer(){
        temperature+=increment;

    }

    /**
     * Decrement the heaters temperature by the increment value (cool down)
     */    
    public void cooler(){ 
        temperature-=increment;

    }
    
    /**
     * Sets the increment value for the heater object if larger than zero.
     * @param newIncrement, new value for the heater to increment for warmer and cooler methods
     */    
    public void setIncrement(int newIncrement){ 
        if (newIncrement>= 0){
            increment = newIncrement;
        }
    }
}
