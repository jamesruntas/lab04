import java.util.*;
/**
 * Main Method for creating a linkedList full of To Do objects.
 * 
 * 
 * @author James Runtas 
 * Student Number 101109175
 * @version Version 1.03 July 19th 2023
 * 
 * SYSC2004 Summer 2023 Lab 6
 */
public class main {

    public static void main(String[] args){

        LinkedList<ToDo> toDoList = new LinkedList<ToDo>(); //Create LinkedList of ToDo objects, a to-do list.

        //Creating 4 To Do Objects
        ToDo toDo1 = new ToDo("Walk Dog", false);
        ToDo toDo2 = new ToDo("Walk Cat", true);
        ToDo toDo3 = new ToDo("Walk Hamster", false);
        ToDo toDo4 = new ToDo("Walk Kids", true);  

        //Setting the time for the completed tasks
        toDo2.convertTime("22:21");
        toDo4.convertTime("99:99");

        //Add all objects to linkedList
        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);
        toDoList.add(toDo4);

        //Loop through all 4 to do items in linked list
        for (int i = 0; i < toDoList.size(); i++) {
            ToDo toDo = toDoList.get(i); // toDo is the current to do item in list
            
            toDo.printItem(); // print To Do item info
        }

        int a1=5;
        double a2 = (float)a1;
    }
    
}
