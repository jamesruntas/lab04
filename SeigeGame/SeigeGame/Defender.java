import java.util.Random;

public class Defender extends Soldier {
    protected int armor2;
    protected int DefenderSpecial;
    protected String specialDefendName;
    protected int specialCount; 

    Random percentage;

    
    // If take cover is chosen during Defend phase, defender blocks 65% of the
    // Defend
    public static final double COVER_PERCENTAGE = 0.65;
    // defenders have 70% chance to block with armors rather than HP
    public static final double ARMOR_DEFENSE_PERCENTAGE = 0.7;
    // Defenders have 20% chance of using their special ability. The random double
    // from nexDouble() must be >= 0.8
    public static final double SPECIAL = 0.8;
    // 60% chance to Defend with primary gun
    public static final double PRIMARY_Defend_PERCENTAGE = 0.4;


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

    public int Defend(){
        System.out.println("Defender " + name + " decides to Defend!");
        double primaryDefendPercentage = percentage.nextDouble();
        // 10% chance to use a one time special ability
        if (primaryDefendPercentage >= SPECIAL && specialCount > 0) {
            System.out.println("Defender " + name + " uses their SPECIAL ABILITY " +
                    specialDefendName + " to deal " + DefenderSpecial +
                    " damage! No more specials left!");
            specialCount--;
            return DefenderSpecial;
        }
        if (primaryDefendPercentage <= PRIMARY_Defend_PERCENTAGE) {
            System.out.println("Defender " + name + " uses their primary gun to deal " +
                    getPrimaryGun() + " damage!");
            return getPrimaryGun();
        } else {
            System.out.println("Defender " + name + " uses their secondary gun to deal " +
                    getSecondaryGun() + " damage!");
            return getSecondaryGun();
        }
    }

    public double takeCover(){
        return 0;
    }

    @Override
    protected void attackedOnArmor(int damageReceived){
        if (armor2 > 0) {
            System.out.println("Defender " + name + " defends with second armor of " + "withstand ability points of " + armor2);
            armor2 = armor2 - damageReceived;
            int remainingArmor2 = armor2;
            
            if (remainingArmor2 < 0) {
                System.out.println("Defender " + name + " has their second armor completely depleted." +" Damage will be dealt to default armor and health points");
                int damageLeft = remainingArmor2 * -1;
                super.attackedOnArmor(damageLeft);
            }
        } else {
            super.attackedOnArmor(damageReceived);
        }


    }

    public void Defended(int damageReceived){
        double DefendedOnArmor = percentage.nextDouble(); //double value between 0.0 and 1.0
        if (DefendedOnArmor < ARMOR_DEFENSE_PERCENTAGE) {
            attackedOnArmor(damageReceived); //Soldier class
        } else {
            attackedOnHP(damageReceived); //Soldier class
        }

    }


    
}
