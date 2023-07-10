/**
 * 
 * 
 * 
 * @author James Runtas
 * @version July 17th 2023
 * * Student Number 101109175
 */


import java.util.*;
import java.io.*;


public class PaintJob{

    public int numCans;
    public float coatCost, paintNeeded;
    private String projectName;
    private float height, width, length, area, budget, canPrice;
    


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
        projectName = iName;
        height = iHeight;
        width = iWidth;
        length = iLength;
        area = (float)2*((iHeight * iWidth) + (iHeight * iLength));
        budget = 0;
        canPrice = 0;
    }


    

    public static void main(String[] args) throws IOException{


        Scanner userInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Project Name");
        String iName = userInput.nextLine();  // Read user input
        System.out.println("Enter Height");
        float iHeight = userInput.nextFloat();  // Read user input
        System.out.println("Enter Width");
        float iWidth = userInput.nextFloat();  // Read user input
        System.out.println("Enter Length");
        float iLength = userInput.nextFloat();  // Read user input
        System.out.println("Enter Price per can");
        float iCanPrice = userInput.nextFloat();  // Read user input
        
        
        PaintJob myPaintJob = new PaintJob(iName,iHeight,iWidth, iLength);

    }

}