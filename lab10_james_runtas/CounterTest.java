/**
 * The test class CounterTest.
 *
 * @author  James Runtas 101109175
 * @version August 3rd 2023
 */
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CounterTest extends junit.framework.TestCase
{
    private Counter c1;
    private Counter c2;
    
    /**
     * Default constructor for test class CounterTest
     */
    public CounterTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    protected void setUp()
    {
        c1 = new RollOverCounter(1, 10);    
        c2 = new LimitedCounter(1, 10);    
    }
    
    /**
     * Tests the original (lab 9) RollOverCounter methods.
     */
    @Test
    public void testAllRollOverCounterMethods()
    {    
        /* Verify that the counter is in the correct initial state. */
        assertEquals(1, c1.minimumCount());
        assertEquals(10, c1.maximumCount());
        assertEquals(1, c1.count());        
        
        assertTrue(c1.isAtMinimum());
        assertFalse(c1.isAtMaximum());
  
        /* Count 1 -> 2 */
        
        c1.countUp();
        assertEquals(2, c1.count());
        assertFalse(c1.isAtMinimum());
        
        /* Count 3, 4, ...9, 10 */
        for (int i = 1; i < 9; i++) {
            c1.countUp();
        }
        assertTrue(c1.isAtMaximum());
        
        /* Count 10 -> 1 */
        c1.countUp();
        assertEquals(1, c1.count());
        
        /* Verify that reset works. */
        c1.countUp();
        c1.countUp();
        c1.reset();
        assertEquals(1, c1.count());
    }    
    
    
    
    
    /**
     * Tests the original (lab 9) LimitedCounter methods.
     */
    @Test
    public void testAllLimitedCounterMethods()
    {    
        /* Verify that the counter is in the correct initial state. */
        assertEquals(1, c2.minimumCount());
        assertEquals(10, c2.maximumCount());
        assertEquals(1, c2.count());        
        
        assertTrue(c2.isAtMinimum());
        assertFalse(c2.isAtMaximum());
  
        /* Count 1 -> 2 */
        
        c2.countUp();
        assertEquals(2, c2.count());
        assertFalse(c2.isAtMinimum());
        
        /* Count 3, 4, ...9, 10 */
        for (int i = 1; i < 9; i++) {
            c2.countUp();
        }
        assertTrue(c2.isAtMaximum());
        
        /* Count 10 -> 10 */
        c2.countUp();
        assertEquals(10, c2.count());
        
        /* Verify that reset works. */
        c2.countUp();
        c2.countUp();
        c2.reset();
        assertEquals(1, c2.count());
    }  
    
    
    /*
     * Tests lab 10 created methods for RollOverCounter.
     */
    @Test
    public void testNewRollOverCounterMethods() {
        assertEquals(1, c1.count()); //ensure count set to min first
        c1.countDown();
        assertEquals(10, c1.count()); //Counting down from minimum should roll over to max
        
        c1.countDown();
        assertEquals(9, c1.count()); //Testing Count Down
        c1.setToMaximum();
        assertTrue(c1.isAtMaximum()); //Testing setToMaximum 
    }
    
    /*
     * Tests lab 10 created methods for limitedCounter.
     */
    @Test
    public void testNewLimitedCounterMethods() {
        assertEquals(1, c2.count()); // Test constructor
        c2.countDown();
        assertEquals(1, c2.count()); //Test count down, should not go below min
        c2.setToMaximum(); 
        assertEquals(10, c2.count()); //Test setToMaximum
        c2.countDown();
        assertEquals(9, c2.count()); //Test CountDown

        
        c2.setToMaximum();
        assertTrue(c2.isAtMaximum()); //Test setToMaximum
    }
    
    
}
