import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * The test class HeaterTest.
 *
 * @author  James Runtas 
 * @version 1.0 July 18th 2023
 */
public class HeaterTest{
   
	static Heater heater1;
	
	/**
     * Default constructor for test class HeaterTest
     */
    public HeaterTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
	@BeforeAll
    private static void setUp(){

		heater1 = null;

    }


	/**
     * output test number
     *
     * Called after every test case method.
     */
	@AfterEach
	private void summary(){
		
		System.out.println("passed");

	}

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
	@AfterAll
    private static void tearDown(){
		System.out.println("all tests done");

    }
    
	@Test
	public void test_DefaultConstructor(){

	    heater1 = new Heater();
	    assertEquals(15, heater1.temperature());

	}
	
	@Test
	public void testWarmer(){

	    Heater heater1 = new Heater();
	    heater1.warmer();
	    assertEquals(20, heater1.temperature());

	}
	
	@Test
	public void testCooler(){

	    Heater heater1 = new Heater();
	    heater1.cooler();
	    assertEquals(10, heater1.temperature());

	}
	
	@Test
	public void test_OverloadedConstructor(){

	    Heater heater1 = new Heater(0, 30);
	    assertEquals(15, heater1.temperature());
	    heater1.warmer();
	    assertEquals(20, heater1.temperature());
	    heater1.cooler();
	    heater1.cooler();
	    assertEquals(10, heater1.temperature());

	}
	
	@Test
	public void test_OverloadedConstructor_MinLargerThanMax(){

	    Heater heater1 = new Heater(30, 0);
	    assertEquals(15, heater1.temperature());
	    heater1.warmer();
	    assertEquals(20, heater1.temperature());
	    heater1.cooler();
	    heater1.cooler();
	    assertEquals(10, heater1.temperature());

	}


	@Test
	public void test_Max_WarmerAndCoolerToLimits(){

	    Heater heater1 = new Heater(0, 30);
	    heater1.warmer();
	    assertEquals(20, heater1.temperature());
	    heater1.warmer();
	    assertEquals(25, heater1.temperature());
	    heater1.warmer();
	    assertEquals(30, heater1.temperature());
	    
	    /* The heater is now set to its maximum temperature.
	     * Additional calls to warmer() should not change the temperature.
	     */
	    heater1.warmer();
	    assertEquals(30, heater1.temperature());
	    
	    Heater heater2 = new Heater(0, 27);
	    heater2.warmer();
	    assertEquals(20, heater2.temperature());
	    heater2.warmer();
	    assertEquals(25, heater2.temperature());
	    
	    /* The heaster is now 2 degrees below its maximum temperature.
	     * Additional calls to warmer() should not change the temperature.
	     */
	    heater2.warmer();
	    assertEquals(25, heater2.temperature());   

	}
	
	@Test
    public void test_Min_WarmerAndCoolerToLimits(){

	    Heater heater1 = new Heater(0, 30);
	    heater1.cooler();
	    assertEquals(10, heater1.temperature());
	    heater1.cooler();
	    assertEquals(5, heater1.temperature());
	    heater1.cooler();
	    assertEquals(0, heater1.temperature());
	    
	    /* The heater is now set to its minimum temperature.
	     * Additional calls to cooler() should not change the temperature.
	     */
	    heater1.cooler();
	    assertEquals(0, heater1.temperature());	 
	    
	    Heater heater2 = new Heater(3, 30);
	    heater2.cooler();
	    assertEquals(10, heater2.temperature());
	    heater2.cooler();
	    assertEquals(5, heater2.temperature());
	    
	    /* The heater is now 3 degrees above its minimum temperature.
	     * Additional calls to cooler() should not change the temperature.
	     */	    
	    heater2.cooler();
	    assertEquals(5, heater2.temperature());
		   	    
	}		
	
	@Test
	public void test_SetIncrement_CallWarmerThenCooler(){

	    Heater heater1 = new Heater(0, 30);
	    
	    heater1.setIncrement(4);
	    heater1.warmer();
	    assertEquals(19, heater1.temperature());
	    heater1.cooler();
	    assertEquals(15, heater1.temperature());

	}
	
	@Test
	public void test_SetIncrement_ZeroAndNegativeIncrement(){

	    Heater heater1 = new Heater(0, 30);
	    heater1.setIncrement(0);
	    /* Increment should remain at 5. */
	    heater1.warmer();
	    assertEquals(20, heater1.temperature());	    
	    heater1.setIncrement(-4);
	    /* Increment should remain at 5. */
	    heater1.warmer();
	    assertEquals(25, heater1.temperature());

	}		

}
