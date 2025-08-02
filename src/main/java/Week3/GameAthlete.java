import java.util.Random;
class GameAthlete {
    // Instance variables
    String name;
    int energy;
    int skillPower;
    int maxEnergy;
    boolean isActive;
  // Static variable
    static int totalAthletes = 0;
 // Default constructor
    public GameAthlete() {
        this.name = "Player";
        this.energy = 100;
        this.skillPower = 10;
        this.maxEnergy = 100;
        this.isActive = true;
        totalAthletes++;
    }
     // Parameterized constructor
    public GameAthlete(String name, int energy, int skillPower, int maxEnergy) {
        this.name = name;
        this.energy = energy;
        this.skillPower = skillPower;
        this.maxEnergy = maxEnergy;
        this.isActive = true;
        totalAthletes++;
    }
    public void compete(GameAthlete opponent) {
        if (this.isActive && opponent.isActive) {
            opponent.energy -= this.skillPower;
            if (opponent.energy <= 0) {
                opponent.energy = 0;
                opponent.isActive = false;
            }
        }
    }
    public void rest(int amount) {
        if (this.isActive) {
            this.energy += amount;
            if (this.energy > this.maxEnergy) {
                this.energy = this.maxEnergy;
            }
        }
    }
    public void train() {
        if (this.isActive) {
            Random random = new Random();
            int gain = random.nextInt(11); // 0 to 10
            this.skillPower += gain;
        }
    }
    public void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Energy: " + energy);
        System.out.println("Skill Power: " + skillPower);
        System.out.println("Max Energy: " + maxEnergy);
        System.out.println("Active: " + isActive);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Create 3 athletes
        GameAthlete a1 = new GameAthlete("Henry", 90, 12, 100);
        GameAthlete a2 = new GameAthlete("John", 80, 15, 100);
        GameAthlete a3 = new GameAthlete();
System.out.println("PRIYADHARSHINI . M (2024503501) || Week3 Program2 ");

        // Compete
        a1.compete(a2);
        a2.compete(a3);
        a3.compete(a1);

        // Rest
        a1.rest(10);
        a2.rest(20);
        a3.rest(15);

        // Train
        a1.train();
        a2.train();
        a3.train();

        // Display stats
        a1.displayStats();
        a2.displayStats();
        a3.displayStats();

        // Display total athlete count
        System.out.println("Total Athletes: " + GameAthlete.totalAthletes);
    }
