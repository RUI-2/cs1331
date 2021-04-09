//I worked on the homework assignment alone, using only course materials.
/**
 * This class represents a water fountain oject
 * @author Ruirui Ma
 * @version 1.0
 */
import java.util.Random;
class Puppy {
    private String name;
    private int age;
    private int health;
    private static Random rand = new Random();

    /**
     * This constructor creates a Puppy of name specified by username, of the age by age and the health by health;
     * @param name The name of the puppy
     * @param age The age of the puppy
     * @param health The health of the puppy
     */
    public Puppy(String name, int age, int health) {
        this.name = name;
        this.age = age;
        this.health = health;
    }

    /**
     * This constructor creates a Puppy of name specified by username, of a random age between zero and fifteen,
     * of a random health between five and thirty-five
     */
    public Puppy(String name) {
        this(name, rand.nextInt(16), rand.nextInt(31) + 5);
    }

    /**
     * This method returns the name of the puppy
     * @return The name of the puppy
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the name of the puppy
     * @param name The name of the puppy
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the age of the puppy
     * @return The age of the puppy
     */
    public int getAge() {
        return age;
    }

    /**
     * This method sets the age of the puppy
     * @param age The age of the puppy
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * This method returns the health of the puppy
     * @return The health of the puppy
     */
    public int getHealth() {
        return health;
    }

    /**
     * This method sets the health of the puppy
     * @param health The health of the puppy
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * This method prints out the name, age and health of the puppy object
     * @return A string containing the name, age and health of the puppy object
     */
    public String toString() {
        return (name + ": a puppy " + age + " years old with " + health + " health");
    }

    /**
     * This method returns whether a puppy is adoptable
     * @return Whether a person can adopt the puppy
     */
    public boolean canAdopt() {
        return (health >= 50);
    }

    /**
     * This method increase the health of the puppy by one
     */
    public void fetch() {
        health++;
    }

    /**
     * This method increments the health of the puppy based on whether the puppy is playing fetch inside or outside:
     * increment by 5 if playing inside, 10 if outside
     * @param inside If the puppy is playing fetch inside or outside
     */
    public void fetch(boolean inside) {
        if (inside) {
            health += 5;
        }
        health += 10;
    }

    /**
     * This method increments the health of the puppy bydistance / 10)
     * @param distance The distance of how far the toy is thrown
     */
    public void fetch(int distance) {
        health += distance / 10;
    }
}
