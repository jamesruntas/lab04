/**
 * 
 * SYSC2004 Lab 9
 * Client (main) implementation
 * 
 * @author James Runtas
 * @version August 1st 2023
 * Student Number 101109175
 * 
 */
public class Client {

    //main 
    public static void main (String[] args){

        System.out.println("Running RollOverCounter");
        //create new roll over counter min 0 max 5
        RollOverCounter rollOverCounter1 = new RollOverCounter(0, 5);
        //should display true
        System.out.println(rollOverCounter1.isAtMinimum());
        //should display 0
        System.out.println(rollOverCounter1.count());

        //Count 10 times 
        for (int i = 0; i <= 10; i++){
            rollOverCounter1.countUp(); //count up by one
            if (rollOverCounter1.isAtMaximum()){
                System.out.println("Counter is at maximum: " + rollOverCounter1.count()); //print counter at max 
            }
            if (rollOverCounter1.isAtMinimum()){
                System.out.println("Counter is at minimum: " +  rollOverCounter1.count()); //print counter at min
            }
            System.out.println(rollOverCounter1.count()); //display count after count up
        }
    
        rollOverCounter1.reset(); //counter reset to 0
        System.out.println("Counter is being reset");
        System.out.println(rollOverCounter1.count()); //should display 0
        System.out.println("******************");
        System.out.println("******************");
        System.out.println("******************");


        System.out.println("Running Limited Counter");
        //Create new limited counter min 0 max 5 
        LimitedCounter limitedCounter1 = new LimitedCounter(0,5);
        System.out.println(limitedCounter1.count()); //should be 0 


        //count 10 times 
        for (int i = 0 ; i <=10; i++){
            limitedCounter1.countUp(); //count by one 
            if (limitedCounter1.isAtMaximum()){
                System.out.println("Counter is at maximum: " +  limitedCounter1.count()); //if at max, print to screen
            }
            if (limitedCounter1.isAtMinimum()){
                System.out.println("Counter is at minimum: " + limitedCounter1.count()); //if at min print to screen
            }
            System.out.println(limitedCounter1.count()); //display the count
        }
       
        //reset the counter back to 0 
        limitedCounter1.reset();
        System.out.println("Counter is being reset");
        System.out.println(limitedCounter1.count()); //should be 0 
        System.out.println("******************");


    }
    
}
