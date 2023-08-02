public class Attacker extends Soldier {
    
    protected int attackerSpecial;
    protected String specialAttackName;
    protected int specialCount; 


    public Attacker(){
        super();
        attackerSpecial = 0;
        specialAttackName = "";
        specialCount = 0;
    }

    public Attacker(int AttackerSpecial, String specialAttackName, int specialCount){
        super();
        this.attackerSpecial = AttackerSpecial;
        this.specialAttackName = specialAttackName;
        this.specialCount = specialCount;
    }
    
}
