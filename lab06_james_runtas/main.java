import java.io.*;
import java.util.*;
/**
 * 
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

        LinkedList<ToDo> toDoList = new LinkedList<ToDo>();

        ToDo toDo1 = new ToDo("Walk Dog", false);
        ToDo toDo2 = new ToDo("Walk Cat", true);
        ToDo toDo3 = new ToDo("Walk Hamster", false);
        ToDo toDo4 = new ToDo("Walk Kids", false);

        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);
        toDoList.add(toDo4);

        for (int i = 0; i < toDoList.size(); i++) {
            ToDo toDo = toDoList.get(i);
            
            toDo.printItem();
        }
    }
    
}
