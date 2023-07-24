import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Testing methods in ToDo class using junit jupiter
 * 
 * 
 * @author James Runtas 
 * Student Number 101109175
 * @version Version 1.03 July 19th 2023
 * 
 * SYSC2004 Summer 2023 Lab 6
 */
public class ToDoTest {
    static ToDo toDoObject; //object to test
    int testCount = 0; //no of tests runned


    public ToDoTest(){ //default constructor empty, no need for it in testing in junit
    }

    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
	@BeforeAll
    private static void setUp(){

		toDoObject = null;

    }


	/**
     * output test number
     *
     * Called after every test case method.
     */
	@AfterEach
	private void summary(){
		testCount++;
		System.out.println("passed: " + testCount );

	}

    /**
     * Tears down the test fixture.
     * Called after all test case method.
     */
	@AfterAll
    private static void tearDown(){
		System.out.println("all tests done");

    }
    /*
     * Testing the default constructor. 
     * ensure title is set as seen in constructor "No Item"
     */
	@Test
	public void test_DefaultConstructor(){
	    toDoObject = new ToDo();
	    assertEquals("No Item", toDoObject.getTitle());
        

	}

    /*
     * Testing overloaded constructor. provide a custom title and ensure getTitle returns it
     */
    @Test
	public void test_OverloadedConstructor(){
	    toDoObject = new ToDo("Walk Dog", true);
	    assertEquals("Walk Dog", toDoObject.getTitle());
        

	}
	
    /*
     * Test a valid call to ConvertTime with a real time. 
     */
	@Test
	public void testConvertTime(){

	    ToDo toDoObject = new ToDo();
	    toDoObject.convertTime("12:18");
	    assertEquals(12, toDoObject.getHours());
        assertEquals(18, toDoObject.getMinutes());

	}

    /*
     * Test ConvertTime with a time that doesnt exist
     */
    @Test
	public void testConvertTimeInvalidTime1(){

	    ToDo toDoObject = new ToDo();
	    toDoObject.convertTime("25:61");
	    assertEquals(-1, toDoObject.getHours());
        assertEquals(-1, toDoObject.getMinutes());

	}
	
    /*
     * Test ConvertTime with a time exceeding 5 chars, which is not possible
     */
    @Test
	public void testConvertTimeInvalidTime2(){

	    ToDo toDoObject = new ToDo();
	    toDoObject.convertTime("123:45");
	    assertEquals(-1, toDoObject.getHours());
        assertEquals(-1, toDoObject.getMinutes());

	}

    /*
     * Test ConvertTime with invalid hour and valid minutes
     */
    @Test
	public void testConvertTimeInvalidTime3(){

	    ToDo toDoObject = new ToDo();
	    toDoObject.convertTime("45:45");
	    assertEquals(-1, toDoObject.getHours());
        assertEquals(45, toDoObject.getMinutes());

	}

    /*
     * Test ConvertTime with valid hour and invalid minutes
     */
    @Test
	public void testConvertTimeInvalidTime4(){

	    ToDo toDoObject = new ToDo();
	    toDoObject.convertTime("05:67");
	    assertEquals(-1, toDoObject.getMinutes());
        assertEquals(05, toDoObject.getHours());

	}


	
}
