public class Defender extends Soldier {
    private int armor2;
    private int DefenderSpecial;
    private String specialDefendName;
    private int specialCount; 

    public Defender(){
        super();
        DefenderSpecial = 0;
        specialDefendName = "";
        specialCount = 0;
        armor2 = 15;
    }

    public Defender(int DefenderSpecial, String specialDefendName, int specialCount){
        super();
        this.DefenderSpecial = DefenderSpecial;
        this.specialDefendName = specialDefendName;
        this.specialCount = specialCount;
        this.armor2 = 15;
    }

    public int attack(){
        return 0;
    }

    public double takeCover(){
        return 0;
    }

    protected void attackedOnArmor(int damagedReceived){

    }

    public void attacked(int damagedReceived){

    }


    
}
