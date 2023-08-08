import javax.swing.*;
import java.awt.*;
/**
 * Main class to create GUI
 * 
 * @author James Runtas 
 * Student Number 101109175
 * @version Version August 8th 2023
 * 
 * SYSC2004 Summer 2023 Lab 11
 */

public class FirstGui {

    JFrame myFrame;
    JPanel myPanel;
    Button button1;
    Button button2;
    Button button3; //define GUI objects

    /*
     * Default Constuctor
     * Initializes JFrame with default values
     */
    public FirstGui(){
        myFrame = new JFrame("Lab 11");
        myFrame.setSize(600, 400);
        myFrame.setLocationRelativeTo(null); //Center
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /*
     * Overloaded Constructor
     * 
     * @param title Frame title
     * @param x frame x dimension
     * @param y  frame y dimension
     */
    public FirstGui(String title, int x, int y){
        myFrame = new JFrame(title);
        myFrame.setSize(x, y);
        myPanel = new JPanel();
        myPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50)); // Panel layout, set each component to centered and x and y gaps
        myFrame.add(myPanel,BorderLayout.CENTER); //add panel to the frame
        myPanel.setBackground(Color.pink);
        myPanel.setPreferredSize(new Dimension(150, 50)); //define panel size

        button1 = new Button("Button 1");
        button2 = new Button("Button 2");
        button3 = new Button("Button 3"); // Creat button objects

        myPanel.add(button1);
        myPanel.add(button2);
        myPanel.add(button3); //add buttons to panel 

        myFrame.setLocationRelativeTo(null); // center frame
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
    

    /*
     * Sets frame to visible 
     */
    public void show(){
        myFrame.setVisible(true); 
    }
}



