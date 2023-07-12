/**
 * 
 * SYSC2004 Summer 2023 Assignment 1.
 * PaintJob class. Contains 2 constructors, 2 getters/setters,
 * as well as the calculate cost function.
 * 
 * @author James Runtas 
 * Student Number 101109175
 * @version Version 1.00 July 17th 2023
 * 
 */
import java.lang.Math;

public class PaintJob{

    private static final float LITER_COVERS_SQUARE_FEET = 100;
    //Static value for conversion of liters of paint to cover square foot area
    
    public int numCans; // number of cans 
    public float coatCost, paintNeeded; // cost of current coat ($), paint needed (L)
    private String projectName; //Name of project
    private float height, width, length, area; //(feet) project area LxWxH and area
    private float budget; //Project budget ($)
    private float canPrice; //Cost of one paint can.
    

    //Default constructor, setting all values to zero and/or null.
    public PaintJob(){
        numCans = 0;
        coatCost = 0;
        paintNeeded = 0;
        projectName = null;
        height = 0;
        width = 0;
        length = 0;
        area = 0;
        budget = 0;
        canPrice = 0;
    }

    /*
     * Overloaded Constructor
     * Creates a PaintJob object with the following attributes to be set (as well as calculate area)
     * 
     * @param iName
     * @param iHeight
     * @param iWidth
     * @param iLength
     * 
     */
    public PaintJob(String iName, float iHeight, float iWidth, float iLength){
        numCans = 0;
        coatCost = 0;
        paintNeeded = 0;
        projectName = iName;
        height = iHeight;
        width = iWidth;
        length = iLength;
        budget = 0;
        canPrice = 0;

        // Wall area = 2*((HxW)+(HxL))
        area = (float)2*((iHeight * iWidth) + (iHeight * iLength));

    }


    /*
     * Method to calculate the project cost for 1,2,3 coats of paint.
     * 
     * @param iCanPrice
     * @param iBudget
     */
    public void calculateCoatCoast(float iCanPrice, float iBudget){
        
        //Loop 3 times, once per coat
        for (int i = 1; i<=3; i++){
            System.out.println("***********************\n");
            System.out.println("Project: " + projectName);
            // a Liter of paint covers 100 square feet
	        paintNeeded = (area * i) / LITER_COVERS_SQUARE_FEET; // Paint needed for current coat number, including paint needed for previous coats
            System.out.println("Amount of paint needed for " + i +" coats: " + paintNeeded + "L");
	        
            //number of 3.7 Liter cans needed to paint the wall
	        numCans =(int) Math.ceil(paintNeeded / 3.7);
	        System.out.println("Number of paint cans needed for " + i + " coats: "  + numCans +  " cans");
            
            //Cost of paint for the number of cans needed and the price per can.
            coatCost = numCans * iCanPrice;
            System.out.println("Paint Cost of " + i + " coats: $" + coatCost + "");

            System.out.println("Remaining Budget after " + i + " coat(s) of paint: $" + (budget -  coatCost));
        }



    }


    /*
     * Setter function for the project budget
     * @param iBudget
     */
    public void setBudget(float iBudget) {
        this.budget = iBudget;
    }

    /*
     * Getter function for the project area
     */
    public Float getArea() {
        return this.area;
    }

}