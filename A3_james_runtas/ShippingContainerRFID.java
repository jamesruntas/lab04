/**
 * RFID container class that uses Shipping Container as its parent. 
 * Represents a shipping container with contents indexing by rfid
 *
 * @author James Runtas
 * Student Number 101109175
 * @version Version 1.0 August 10th 2023
 *
 * SYSC2004 Summer 2023 Assignment 3
 */



 import java.util.LinkedList;

public class ShippingContainerRFID extends ShipContainer {

    private LinkedList<Integer> count; //quantity of items in contents list
    private LinkedList<String> contents; //items in container

    //Contructor for RFID container.
    public ShippingContainerRFID(int newID){
        super(); //using parent class to initialize object
        this.setContainerID(newID); //setting new ID value to remover default of 0 set by super
        count = new LinkedList<Integer>(); // initialize count linkedlist
        contents = new LinkedList<String>(); //initialize contents linkedlist

    }

    
    /** 
     * Searches content linkedlist for the index of an item
     * @param s the item
     * @return int , the index
     */
    private int searchItem(String s){
        return contents.indexOf(s);
    }

    
    /** 
     * Adding item to container using RFID.
     * Overrides abstract super implementation.
     * @param s the item 
     */
    @Override
    public void setContents(String s){
        int index = searchItem(s); //location of item, if not found returns -1

        // If the item is not in the list, add it with a count of 1.
        if(index == -1) {
            contents.add(s);
            count.add(1);
        } else {
            // Otherwise, increment the count of the item.
            count.set(index, count.get(index) + 1);
        }
    }

    
    /** 
     * Returns a string representing items of container and quantities.
     * Ovverides abstract super implementation 
     * @return String
     */
    @Override
    public String containerContentList(){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < contents.size(); i++) {
            if (i > 0) str.append(". "); // Use ". " to separate items
            str.append(count.get(i)).append(" ").append(contents.get(i));
        }
        str.append("."); // Append a "." at the end
        return str.toString();
    }
    
}
