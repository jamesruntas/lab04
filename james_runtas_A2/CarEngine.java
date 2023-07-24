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
        //𝐻𝑜𝑟𝑠𝑒𝑝𝑜𝑤𝑒𝑟 = 𝑇𝑜𝑟𝑞𝑢𝑒 × 𝑅𝑃𝑀/5252 
        return torque*(speed/RADIANS_PER_SECOND);
    }

    private float calculateEngineDisplacement(){
        //𝐸𝑛𝑔𝑖𝑛𝑒 𝑑𝑖𝑠𝑝𝑙𝑎𝑐𝑒𝑚𝑒𝑛𝑡 = 𝜋𝑟2 × 𝑆𝑡𝑟𝑜𝑘𝑒 × 𝑁𝑢𝑚𝑏𝑒𝑟 𝑜𝑓 𝑐𝑦𝑙𝑖𝑛𝑑𝑒𝑟𝑠
        return Math.PI*(Math.pow(boreSize/2, boreSize/2))*stroke*numCylinders;
    }

    private float calculateHorsePowerFromDisplacement(){
        return engineDisplacement/CC_FROM_HP;
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
