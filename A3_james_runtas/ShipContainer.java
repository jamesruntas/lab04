/*
 *
 * 
 * 
 * 
 *  
 */

public abstract class ShipContainer{

    protected int containerID;

    public ShipContainer(){

    }

    public int getContainerID(){
        return containerID;
    }

    public abstract void setContents(String contents);

    public void setContainerID(int ID){
        this.containerID = ID;
    }

    public String containerContentList(){
        return "";
    }

    public void printContent(){

    }


}