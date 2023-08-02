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
    }

    public Defender(int DefenderSpecial, String specialDefendName, int specialCount){
        super();
        this.DefenderSpecial = DefenderSpecial;
        this.specialDefendName = specialDefendName;
        this.specialCount = specialCount;
    }
    
}
