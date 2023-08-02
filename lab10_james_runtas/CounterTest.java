/**
 * The test class CounterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class CounterTest {
    private RollOverCounter c1;
	
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
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    protected void tearDown()
    {
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
}
