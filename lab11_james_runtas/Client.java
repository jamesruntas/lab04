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

public class Client {

    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable() { //Must use in order to properly create a swing GUI object.
            @Override
            public void run() { //We are overriding the runnable 'run' method because it is abstract in the super class
                FirstGui frame = new FirstGui(); //create gui and show
                frame.show();

                FirstGui frame2 = new FirstGui("Lab 11 window 2", 300, 150);
                frame2.show();
            }
            });

    }
    
}
