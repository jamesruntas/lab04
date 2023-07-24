package james_runtas_A2;

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



    public CarEngine(){

    }

    public CarEngine(String companyName, int torque, int speed, int boreSize, int stroke, int numCylinders){

    }

    private float calculateHorsePowerFromTorque(){
        
        return 0.0;
    }

    private float calculateEngineDisplacement(){
        
        return 0.0;
    }

    private float calculateHorsePowerFromDisplacement(){

        return 0.0;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public String getCompanyName(){
        return this.companyName;
    }

    public void setEngineDisplacement(float engineDisplacement){
        this.engineDisplacement = engineDisplacement;
    }

    public float getEngineDisplacement(){
        return this.engineDisplacement;
    }

    public void setHorsePower(String companyName){
        this.companyName = companyName;
    }


    public float getHorsePower(){
        return this.horsePower;
    }

    public void setTorque(int torque){
        this.torque = torque;
    }

    public int getTorque(){
        return this.torque;
    }

    public void setBoreSize(int boreSize){
        this.boreSize = boreSize;
    }

    public int getBoreSize(){
        return this.boreSize;
    }

    public void setStroke(int stroke){
        this.stroke = stroke;
    }

    public int getStroke(){
        return this.stroke;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void setNumCylinders(int numCylinders){
        this.numCylinders = numCylinders;
    }

    public int getNumCylinders(){
        return this.numCylinders;
    }







    
}
