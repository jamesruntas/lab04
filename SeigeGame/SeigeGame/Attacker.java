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

    public int attack(){
        return 0;
    }

    public double takeCover(){
        return 0;
    }

    public void attacked(int damagedReceived){

    }
    
}
