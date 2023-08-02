public class Soldier {

    protected String name;
    protected String department;
    protected int age;
    protected int armor;
    protected int health;
    protected int primaryGun;
    protected int secondaryGun;

    public Soldier() {
        this("Default Name", "Default Department", 0, 0, 0, 0, 0);

    }

    public Soldier(String name, String department, int age, int armor, int health, int primaryGun, int secondaryGun) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.armor = armor;
        this.health = health;
        this.primaryGun = primaryGun;
        this.secondaryGun = secondaryGun;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public int getArmor() {
        return armor;
    }

    public int getHealth() {
        return health;
    }

    public int getPrimaryGun() {
        return primaryGun;
    }

    public int getSecondaryGun() {
        return secondaryGun;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPrimaryGun(int primaryGun) {
        this.primaryGun = primaryGun;
    }

    public void setSecondaryGun(int secondaryGun) {
        this.secondaryGun = secondaryGun;
    }

    protected void attackedOnArmor(int damageReceived) {
        System.out.println(
                "Soldier " + name + " receives " + damageReceived + " of damage and tries to block with armor.");
        if (armor > 0) {
            if (armor < damageReceived) {
                armor = armor - damageReceived;
                System.out.println("Soldier " + name + " has their armor depleted completely.");
                health = health - (armor * -1);
                if (health > 0) {
                    System.out.println("Soldier " + name + " has their health points depleted to " + health);
                } else {
                    System.out.println("Soldier " + name + " has their health points depleted COMPLETELY.");
                }
            } else {
                armor = armor - damageReceived;
                System.out.println("Soldier " + name + " has their armor depleted to " + armor);
            }
        } else {
            System.out.println("Soldier " + name + " has no armor left; hit points going to HP");
            health = health - damageReceived;
            if (health > 0) {
                System.out.println("Soldier " + name + " SURVIVES the attack with " + health + " health remaining!");
            } else {
                System.out.println("Soldier " + name + " DOES NOT survive the attack. All health points depleted");
            }
        }
    }

    protected void attackedOnHP(int damageReceived) {
        health = health - damageReceived;
        if (health > 0) {
            System.out.println("Soldier " + name + " SURVIVES the attack with " + health + " health remaining!");
        } else {
            System.out.println("Soldier " + name + " DOES NOT survive the attack. All health points depleted");
        }
    }

    public void printDescription() {
        if (armor < 0) {
            armor = 0;
        }
        if (health < 0) {
            health = 0;
        }
        System.out.println("\n{name: " + name + "\narmor: " + armor + "\nhealth(HP): " + health + "}");
    }

    @Override
    public String toString() {
        return "\n{name: " + name +
                "\narmor: " + armor +
                "\nhealth(HP): " + health +
                "}";
    }

    public void attacked(int damagedReceived){};
    
    public int attack(){return 0;}
    
    public double takeCover(){return 0;}

}
