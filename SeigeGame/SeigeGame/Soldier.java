public class Soldier {

    protected String name;
    protected String department;
    protected int age;
    protected int armor;
    protected int health;
    protected int primaryGun;
    protected int secondaryGun;
    


    public Soldier(){
        this("Default Name", "Default Department", 0,0,0,0,0);

    }

    public Soldier(String name, String department, int age, int armor, int health, int primaryGun, int secondaryGun){
        this.name = name;
        this.department = department;
        this.age = age;
        this.armor = armor;
        this.health = health;
        this.primaryGun = primaryGun;
        this.secondaryGun = secondaryGun;
    }

    /**
    Display the soldier's details at a certain
    point of the game
    */
    public void printDescription(){
        if (armor < 0){
            armor = 0;
        }
        if (health < 0){
            health = 0;
        }
        System.out.println("\n{name: " + name + "\narmor: " + armor + "\nhealth(HP): " + health +"}");
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




}
