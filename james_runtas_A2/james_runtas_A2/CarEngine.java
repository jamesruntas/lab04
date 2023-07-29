/**
 * Class representing a car engine.
 *
 * @author James Runtas
 * Student Number 101109175
 * @version Version 1.0 July 29th 2023
 *
 * SYSC2004 Summer 2023 Assignment 2
 */

public class CarEngine {

    private final int CC_FROM_HP = 15;
    private final int RADIANS_PER_SECOND = 5252;
    private int speed;
    private int torque;
    private int numCylinders;
    private int stroke;
    private int boreSize;
    private float engineDisplacement;
    private float horsePower;
    private String companyName;

    /**
     * Default constructor for CarEngine class.
     * Initializes engine parameters with default values.
     */
    public CarEngine() {
        this("Unknown", 0, 0, 0, 0, 0);
    }

    /**
     * Constructor for CarEngine class.
     * Initializes engine parameters with provided values and calculates horsepower and engine displacement.
     * @param companyName    name of the company that produced the engine
     * @param torque         torque of the engine
     * @param speed          speed of the engine
     * @param boreSize       bore size of the engine
     * @param stroke         stroke of the engine
     * @param numCylinders   number of cylinders in the engine
     */
    public CarEngine(String companyName, int torque, int speed, int boreSize, int stroke, int numCylinders) {
        this.setCompanyName(companyName);
        this.setTorque(torque);
        this.setSpeed(speed);
        this.setBoreSize(boreSize);
        this.setStroke(stroke);
        this.setNumCylinders(numCylinders);
        this.setEngineDisplacement();
        setHorsePower(true);

    }

    /**
     * Calculates horsepower from torque.
     * @return horsepower value.
     */
    private float calculateHorsePowerFromTorque() {
        return (float) torque * speed / RADIANS_PER_SECOND;
    }

    /**
     * Calculates engine displacement.
     * 𝐸𝑛𝑔𝑖𝑛𝑒 𝑑𝑖𝑠𝑝𝑙𝑎𝑐𝑒𝑚𝑒𝑛𝑡 = 𝜋𝑟^2 × 𝑆𝑡𝑟𝑜𝑘𝑒 × 𝑁𝑢𝑚𝑏𝑒𝑟 𝑜𝑓 𝑐𝑦𝑙𝑖𝑛𝑑𝑒𝑟𝑠
     * @return engine displacement value.
     */
    private float calculateEngineDisplacement() {
        float boreSizeCm = boreSize / 10f; // convert mm to cm
        float strokeCm = stroke / 10f; // convert mm to cm
        return (float) (Math.PI * Math.pow(boreSizeCm / 2, 2) * strokeCm * numCylinders);
    }

    /**
     * Calculates horsepower from engine displacement.
     * @return horsepower value.
     */
    private float calculateHorsePowerFromDisplacement() {
        return engineDisplacement / CC_FROM_HP;
    }

    /**
     * Sets the company name. If input is null, sets it to "Unknown".
     * @param companyName company name
     */
    public void setCompanyName(String companyName) {
        if (companyName == null) {
            this.companyName = "Unknown";
        } else {
            this.companyName = companyName;
        }
    }

    /**
     * @return company name.
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * Sets engine displacement by calculating it.
     */
    public void setEngineDisplacement() {
        this.engineDisplacement = calculateEngineDisplacement();
    }

    /**
     * @return engine displacement.
     */
    public float getEngineDisplacement() {
        return this.engineDisplacement;
    }

    /**
     * Sets horsepower. If source is true, calculates horsepower from torque.
     * If source is false, calculates horsepower from displacement.
     * @param source Indicates how to calculate horsepower.
     */
    public void setHorsePower(Boolean source) {
        if (source) {
            this.horsePower = calculateHorsePowerFromTorque();
        } else {
            this.horsePower = calculateHorsePowerFromDisplacement();
        }
    }

    /**
     * @return horsepower.
     */
    public float getHorsePower() {
        return this.horsePower;
    }

    /**
     * Sets the torque. If input is negative, sets torque to zero.
     * @param torque The new torque.
     */
    public void setTorque(int torque) {
        if (torque < 0) {
            this.torque = 0;
        } else {
            this.torque = torque;
        }
    }

    /**
     * @return The current torque.
     */
    public int getTorque() {
        return this.torque;
    }

    /**
     * Sets the bore size of the engine. If the input is negative or over 100,
     * it sets bore size to 1 or 100, respectively.
     * @param boreSize The new bore size of the engine.
     */
    public void setBoreSize(int boreSize) {
        if(boreSize >= 0 && boreSize <= 100) {
            this.boreSize = boreSize;
        } else if (boreSize < 0) {
            this.boreSize = 1;
        } else {
            this.boreSize = 100;
        }
    }

    /**
     * @return The current bore size of the engine.
     */
    public int getBoreSize() {
        return this.boreSize;
    }

    /**
     * Sets the stroke of the engine. If the input is negative or over 100,
     * it sets stroke to 1 or 100, respectively.
     * @param stroke The new stroke of the engine.
     */
    public void setStroke(int stroke) {
        if(stroke >= 0 && stroke <= 100) {
            this.stroke = stroke;
        } else if (stroke < 0) {
            this.stroke = 1;
        } else {
            this.stroke = 100;
        }
    }

    /**
     * @return The current stroke of the engine.
     */
    public int getStroke() {
        return this.stroke;
    }

    /**
     * Sets the speed of the engine. If the input is negative, sets speed to zero.
     *
     * @param speed The new speed of the engine.
     */
    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    /**
     * @return The current speed of the engine.
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Sets the number of cylinders. If the input is negative or more than 8, it sets the number of cylinders to 1 or 8, respectively.
     * @param numCylinders The new number of cylinders.
     */
    public void setNumCylinders(int numCylinders) {
        if (numCylinders <= 0) {
            this.numCylinders = 0;
        } else if (numCylinders > 8) {
            this.numCylinders = 8;
        } else {
            this.numCylinders = numCylinders;
        }
    }

    /**
     * @return The current number of cylinders.
     */
    public int getNumCylinders() {
        return this.numCylinders;
    }
}

