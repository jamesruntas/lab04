/**
 * Ship Container super class with getters and setters, printing, and connstructors.
 *
 * @author James Runtas
 * Student Number 101109175
 * @version Version 1.0 August 10th 2023
 *
 * SYSC2004 Summer 2023 Assignment 3
 */


public abstract class ShipContainer{

    protected int containerID; //RFID tag of container
    protected static int lastAssignedID = 99; // start from 99 as the next will be 100

    //Default constructor
    public ShipContainer(){
        lastAssignedID++;
        this.containerID = lastAssignedID;
    }

    
    /** 
     * Getter for protected attribute ID
     * @return int
     */
    public int getContainerID(){
        return containerID;
    }

    //Abstract implementation of setContents for use in child classes
    public abstract void setContents(String contents);

    
    /** 
     * Setter for protected attribute ID
     * @param ID
     */
    public void setContainerID(int ID){
        this.containerID = ID;
    }

    //Abstract implementation of Content list. 
    //Set to abstract because it was not being used in this class and also needs unique implementations due to different child classes 
    public abstract String containerContentList();

    /*
     * Prints container contents and ID tag.
     */
    public void printContent() {
        System.out.println("Container " + containerID + " contains " + containerContentList());
    }
    


}