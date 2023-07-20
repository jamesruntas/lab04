import java.io.*;
import java.util.*;
import java.math.*;
/**
 * 
 * 
 * 
 * @author James Runtas 
 * Student Number 101109175
 * @version Version 1.03 July 19th 2023
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

    public ToDo(){
        this("No Item", false);
    }

    public ToDo(String title, Boolean completed){
        count+=1;
        this.itemNumber = count;
        this.title = title;
        this.completed = completed;
        this.hours = 0;
        this.minutes = 0;
    }

    public void printItem(){
        if (this.completed){
            System.out.println("Item " + itemNumber + ": " + title + " | Completed at " + hours + ":" + minutes);
        }
        else{
            System.out.println("Item " + itemNumber + ": " + title + " | Not Completed");
        }

    }

    public void convertTime(String timeEnded){
        //int intTimeEnded = Integer.parseInt(timeEnded);
        if (timeEnded.length() !=5){ //if time exceed 24hr format characters (4 + :)
            hours = -1;
            minutes = -1;
        }
        int iHours = Integer.parseInt(timeEnded.substring(0,1));
        int iMinutes = Integer.parseInt(timeEnded.substring(3, 4));
        
        if (iHours > 23){
            hours = -1;
        }else{
            hours = iHours;
        }
        
        if (iMinutes>59){
            minutes = -1;
        }
        else{
            minutes = iMinutes;
        }

    }

    public int getMinutes(){
        return 0;
    }

    public void setMinutes(int minutes){

    }

    public void setHours(int hours){

    }

    public int getHours(){
        return 0;
    }

    public String getTitle(){
        return "";
    }

    protected void setCompleted(Boolean completed){
        
    }

    public Boolean isCompleted(){
        return false;
    }

    public void setTitle(String title){

    }

}