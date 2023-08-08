/**
 * 
 * SYSC2004 Lab 10
 * Roll over Counter implementation 
 * 
 * @author James Runtas
 * @version August 3rd 2023
 * * Student Number 101109175
 */



public class RollOverCounter extends Counter
{
    /**
     * Constructs a new RollOverCounter whose current count is
     * initialized to DEFAULT_MINIMUM, and which counts between
     * DEFAULT_MINIMUM and DEFAULT_MAXIMUM, inclusive.
     */
    public RollOverCounter()
    {
        super();
    }

    /**
     * Constructs a new RollOverCounter whose current count is
     * initialized to minCount, and which counts between
     * minCount and maxCount, inclusive.
     */
    public RollOverCounter(int minCount, int maxCount)
    {
        super(minCount, maxCount);
    }

    /**
     * Increment this counter by 1.
     */
    public void countUp()
    {
        // If we've reached the maximum count, invoking this
        // method rolls the counter over to its minimum value.
        if (super.isAtMaximum()) {
            super.reset();
        } else {
            super.countUp(); //use super class count method
        }
    }
    /**
     * Decrement this counter by 1. If we've reached the minimum count,
    * invoking this method rolls the counter over to its maximum value.
     */ 
     public void countDown()
     {
          if (isAtMinimum()) {
            setToMaximum();
        }else{
            super.decrementCount(); //use super class method.
        }
     }
}

 