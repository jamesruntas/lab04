/**
 * A Heater models a simple space-heater. The operations provided by a Heater
 * object are:
 * 1. Increase and decrease the temperature setting by a set amount.
 * 2. Return the current temperature setting.
 * 3. Change the set amount by which the temperature is increased and lowered.
 * 
 * @author James Runtas 
 * Student Number 101109175
 * @version Version 1.03 July 18th 2023
 * 
 * SYSC2004 Summer 2023 Lab 5
 */

public class Heater{
    private int temperature;
    private static final int INITIAL_TEMPERATURE = 15;
    private int increment;
    private static final int DEFAULT_INCREMENT = 5;
    private int minTemp, maxTemp;
    

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
     * Constructs a new heater with a minimum temperature and maximum temperature.
     * 
     */    
    public Heater(int iminTemp, int imaxTemp) {
        
        if(iminTemp<=imaxTemp){
            minTemp = iminTemp;
            maxTemp = imaxTemp;
        }
        temperature = INITIAL_TEMPERATURE;
        increment = DEFAULT_INCREMENT;
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

        if (maxTemp == 0 && minTemp == 0){   //Control statement to check if default constructor was used, therefore min and max are set to zero.
            temperature+=increment;
        }
        else if(temperature+increment<=maxTemp){ //If maxtemp has been set, ensure increment wont go over this value.
            temperature+=increment;
        }
    }

    /**
     * Decrement the heaters temperature by the increment value (cool down)
     */    
    public void cooler(){ 
        if (maxTemp == 0 && minTemp == 0){   //Control statement to check if default constructor was used, therefore min and max are set to zero.
            temperature-=increment;
        }
        else if(temperature-increment>=minTemp){
            temperature-=increment;
        }
        

    }
    
    /**
     * Sets the increment value for the heater object if larger than zero.
     * @param newIncrement, new value for the heater to increment for warmer and cooler methods
     */    
    public void setIncrement(int newIncrement){ 
        if (newIncrement> 0){
            increment = newIncrement;
        }
    }


    public int getMin(){
        return minTemp;
    }

    public int getMax(){
        return maxTemp;
    }

    public int getIncrement(){
        return increment;
    }
}
