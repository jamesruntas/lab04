/**
 * 
 * 
 * 
 * 
 * @author James Runtas 
 * Student Number 101109175
 * @version Version 1.00 July 17th 2023
 * 
 * SYSC2004 Summer 2023 Assignment 1
 */

import java.lang.Math;


public class PaintJob{


    private static final float LITER_COVERS_SQUARE_FEET = 100;
    public int numCans;
    public float coatCost, paintNeeded;
    private String projectName;
    private float height, width, length, area;
    private float budget;
    private float canPrice;
    


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

    public void calculateCoatCoast(float iCanPrice, float iBudget){
        
        for (int i = 1; i<=3; i++){
            System.out.println("***********************\n");
            System.out.println("Project: " + projectName);
            // a Liter of paint covers 100 square feet
	        paintNeeded = (area * i) / LITER_COVERS_SQUARE_FEET;
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

    public void setBudget(float iBudget) {
        this.budget = iBudget;
    }

    public Float getArea() {
        return this.area;
    }

}