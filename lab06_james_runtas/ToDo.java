/**
 * ToDo class for SYSC2004 Lab 6
 * 
 * 
 * @author James Runtas 
 * Student Number 101109175
 * @version Version 1.03 July 20th 2023
 * 
 * SYSC2004 Summer 2023 Lab 6
 */
public class ToDo{

    private static int count = 1;
    private int itemNumber;
    private int hours;
    private int minutes;
    private Boolean completed;
    private String title;

    /*
     * Default constructor.
     * uses the implementation of the overloaded constructor to create object.
     */
    public ToDo(){
        this("No Item", false);
    }

    /*
     * Overloaded Constructor
     * 
     * Takes title of ToDo and completed flag.
     */
    public ToDo(String title, Boolean completed){
        count+=1;
        this.itemNumber = count;
        this.title = title;
        this.completed = completed;
        this.hours = 0;
        this.minutes = 0;
    }

    /*
     * Prints information for the ToDo object.
     * Two different outputs depending if the task is completed.
     */
    public void printItem(){
        if (this.completed){ //If To Do is done, print the time finished at
            System.out.println("Item " + itemNumber + ": " + title + " | Completed at " + hours + ":" + minutes);
        }
        else{ //If not finished, no time.
            System.out.println("Item " + itemNumber + ": " + title + " | Not Completed");
        }

    }

    /*
     * Method ConvertTime, takes timeEnded parameter as a string, runs a few control statements to ensure right syntax of timeEnded
     * then set the ToDo objects hours and minutes to the integer format of TimeEnded.
     * 
     * @param timeEnded, string of 24hr time in format "xx:xx"
     */
    public void convertTime(String timeEnded){
        //int intTimeEnded = Integer.parseInt(timeEnded);
        if (timeEnded.length() !=5){ //if time exceed 24hr format characters (4 + :)
            hours = -1;
            minutes = -1;
            return; //Exit out of method so hours and minutes not set to zero below
        }
        int iHours = Integer.parseInt(timeEnded.substring(0,2)); //Extraction and conversion of string TimeEnded hour value
        int iMinutes = Integer.parseInt(timeEnded.substring(3, 5)); // Extraction and conversion of string TimeEnded minute value.
        
        if (iHours > 23){ //if hours invalid, set to -1
            hours = -1;
        }else{
            hours = iHours; // if hours valid, set to extracted and converted hour value
        }
        
        if (iMinutes>59){ // if minutes invalid, set to -1
            minutes = -1;
        }
        else{
            minutes = iMinutes; // if mins valid, set to extracted and converted min value
        }

    }

    //Minute Getter
    public int getMinutes(){
        return minutes;
    }

    //Minutes Setter
    public void setMinutes(int minutes){
        this.minutes = minutes;
    }

    //Hours Setter
    public void setHours(int hours){
        this.hours = hours;
    }

    //Hours Getter
    public int getHours(){
        return this.hours;
    }

    //Title Getter
    public String getTitle(){
        return title;
    }

    //Completed Setter
    protected void setCompleted(Boolean completed){
        this.completed = completed;
        
    }

    //Title Setter
    public void setTitle(String title){
        this.title = title;
    }

}