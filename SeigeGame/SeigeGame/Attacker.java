import java.util.Random;

public class Attacker extends Soldier {
    
    protected int attackerSpecial;
    protected String specialAttackName;
    protected int specialCount; 

    Random percentage;

    // 60% chance to attack with primary gun
    public static final double PRIMARY_ATTACK_PERCENTAGE = 0.6;
    // If take cover is chosen during attack phase, attacker blocks 50% of the
    // attack
    public static final double COVER_PERCENTAGE = 0.5;
    // attackers have 50% chance to block with armor rather than HP
    public static final double ARMOR_DEFENSE_PERCENTAGE = 0.5;
    // Attackers have 10% chance of using their special attack. The random double
    // from nexDouble() must be >= 0.9
    public static final double SPECIAL = 0.9;


    public Attacker(){
        super();
        attackerSpecial = 0;
        specialAttackName = "";
        specialCount = 0;
        percentage = new Random();
    }

    public Attacker(int AttackerSpecial, String specialAttackName, int specialCount){
        super();
        this.attackerSpecial = AttackerSpecial;
        this.specialAttackName = specialAttackName;
        this.specialCount = specialCount;
    }

    public int attack(){
        System.out.println("Attacker " + name + " decides to attack!");
        double primaryAttackPercentage = percentage.nextDouble();
        // 10% chance to use a one time special ability
        if (primaryAttackPercentage >= SPECIAL && specialCount > 0) {
            System.out.println("Attacker " + name + " uses their SPECIAL ABILITY " +
                    specialAttackName + " to deal " + attackerSpecial +
                    " damage! No more specials left!");
            specialCount--;
            return attackerSpecial;
        }
        if (primaryAttackPercentage <= PRIMARY_ATTACK_PERCENTAGE) {
            System.out.println("Attacker " + name + " uses their primary gun to deal " +
                    getPrimaryGun() + " damage!");
            return getPrimaryGun();
        } else {
            System.out.println("Attacker " + name + " uses their secondary gun to deal " +
                    getSecondaryGun() + " damage!");
            return getSecondaryGun();
        }
    }

    public double takeCover(){
        System.out.println("Attacker " + name + " decides to take cover" +
                " from the opponent's next attack");
        System.out.println("Attacker " + name + " enters defense mode to block 50%" +
                " of the opponent's next attack");
        return COVER_PERCENTAGE;
    }

    public void attacked(int damageReceived){
        double attackedOnArmor = percentage.nextDouble(); //double value between 0.0 and 1.0
        if (attackedOnArmor < ARMOR_DEFENSE_PERCENTAGE) {
            attackedOnArmor(damageReceived); //Soldier class
        } else {
            attackedOnHP(damageReceived); //Soldier class
        }
    }
    
}
