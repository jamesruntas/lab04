/**
 * Manual content list class that uses Shipping Container as its parent. 
 * 
 *
 * @author James Runtas
 * Student Number 101109175
 * @version Version 1.0 August 10th 2023
 *
 * SYSC2004 Summer 2023 Assignment 3
 */


public class ManualContentList extends ShipContainer{

    private String contents; //holds container content description

    //Default constructor creates object
    public ManualContentList(){
        super(); //using super constructor to create object
        this.contents = null; //initialize default contents

    }

    //Overloaded constructor to create object.
    /** 
     * @param newID ID value that ovverides the default ID of 0
     */
    public ManualContentList(int newID){
        super();
        this.setContainerID(newID);
        this.contents = null;
    }

    
    /** 
     * Getter method for returning private attribute Contents.
     * @return String
     */
    @Override
    public String containerContentList(){
        return contents;
    }



    
    /** 
     * Setter method for setting private attribute Contents.
     * @param contents
     */
    @Override
    public void setContents(String contents) {
        this.contents = contents;
    }
    
    
}
