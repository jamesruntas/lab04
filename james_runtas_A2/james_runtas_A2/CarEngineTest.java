import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Testing constructors and methods for the Car Engine class.
 *
 * @author James Runtas
 * Student Number 101109175
 * @version Version 1.0 July 29th 2023
 *
 * SYSC2004 Summer 2023 Assignment 2
 */


public class CarEngineTest {

    public CarEngineTest(){ //default constructor empty, no need for it in testing in junit
    }


    /*
     * Test Car Engine default constructor to ensure default values.
     */
    @Test
    public void testDefaultConstructor(){
        CarEngine carEngineObject = new CarEngine();
        assertEquals(0,carEngineObject.getSpeed());
        assertEquals(0,carEngineObject.getTorque());
        assertEquals(0,carEngineObject.getNumCylinders());
        assertEquals(0,carEngineObject.getStroke());
        assertEquals(0,carEngineObject.getEngineDisplacement());
        assertEquals(0,carEngineObject.getHorsePower());
        assertEquals("Unknown",carEngineObject.getCompanyName());
    }

    @Test
    public void testOverloadedConstructor(){
        CarEngine carEngineObject = new CarEngine("Test Name", 100, 500, 80, 90, 1);
        assertEquals(500,carEngineObject.getSpeed());
        assertEquals("Test Name",carEngineObject.getCompanyName());

    }
    @Test void testSetEngineDisplacement1(){
        CarEngine carEngineObject = new CarEngine("Test Name", 100, 500, 80, 90, 1);
        assertEquals(452.16, carEngineObject.getEngineDisplacement(), 0.3);
    }
    @Test void testSetEngineDisplacement2(){
        CarEngine carEngineObject = new CarEngine();
        assertEquals(0, carEngineObject.getEngineDisplacement());
    }
    @Test void testSetHorsePower1(){
        CarEngine carEngineObject = new CarEngine("Test Name", 100, 500, 80, 90, 1);
        assertEquals(9.52,carEngineObject.getHorsePower(), 0.3);
    }
    @Test void testSetHorsePower2(){
        CarEngine carEngineObject = new CarEngine();
        assertEquals(0, carEngineObject.getHorsePower());
    }
    @Test void testSetCompanyName(){
        CarEngine carEngineObject = new CarEngine();
        carEngineObject.setCompanyName(null);
        assertEquals("Unknown",carEngineObject.getCompanyName());
    }
    @Test void testSetNumCylinders1(){
        CarEngine carEngineObject = new CarEngine();
        carEngineObject.setNumCylinders(-1);
        assertEquals(0,carEngineObject.getNumCylinders());
    }
    @Test void testSetNumCylinders2(){
        CarEngine carEngineObject = new CarEngine();
        carEngineObject.setNumCylinders(10);
        assertEquals(8,carEngineObject.getNumCylinders());
    }
    @Test void testSetBoreSize1(){
        CarEngine carEngineObject = new CarEngine();
        carEngineObject.setBoreSize(-1);
        assertEquals(1,carEngineObject.getBoreSize());
    }
    @Test void testSetBoreSize2(){
        CarEngine carEngineObject = new CarEngine();
        carEngineObject.setBoreSize(101);
        assertEquals(100,carEngineObject.getBoreSize());
    }


}
