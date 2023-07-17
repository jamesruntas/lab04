/**
 * SYSC2004 Summer 2023 Lab 4
 * Main Class and 'client'.  creates student and faculty objects. prints out their info.
 * 
 * @author James Runtas 
 * Student Number 101109175
 * @version Version 1.00 July 14th 2023
 * 
 */
public class Main {
    
    public static void main(String[] args){

        //Removed code that creates person object as it is now abstract and cant be created.
        Student jamesRuntas = new Student();
        Faculty ramiSabouni = new Faculty();


        jamesRuntas.printInfo();
        ramiSabouni.printInfo();



        
    }

}
