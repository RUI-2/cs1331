//I worked on the homework assignment alone, using only course materials.
/**
 * This file contains class Pikachu, which is a child class of Pokemon
 * @author Ruirui Ma
 * @version 1.0
 */
public class Pikachu extends Pokemon {
    private int friendshipLevel;

    /**
     * Constructor to create a Pikachu object
     * @param trainerName The name of the trainer of the Pikachu
     * @param health The current health of the Pikachu
     * @param maxHealth The maximum health of the Pikachu
     * @param friendshipLevel The friendshipLevel of the Pikachu
     */
    public Pikachu(String trainerName, int health, int maxHealth, int friendshipLevel) {
        super(trainerName, health, maxHealth);
        this.friendshipLevel = friendshipLevel;
    }

    /**
     * Copy constructor to copy a Pikachu object
     * @param other The pikachu object to be copied
     */
    public Pikachu(Pikachu other) {
        super(other);
        this.friendshipLevel = other.friendshipLevel;
    }

    /**
     * This method heals the pikachu by specified by amount
     * @param amount The amount of heal pikachu gets
     */
    @Override
    public void heal(int amount) {
        super.heal(2 * amount);
    }

    /**
     * This method defines what makes two pikachu equivalent
     * @param other The object passed in to be compared
     */
    @Override
    public boolean equals(Object other) {
        boolean result = super.equals(other);
        if (result) {
            if (other instanceof Pikachu) {
                Pikachu p = (Pikachu) other;
                if (this.friendshipLevel == p.friendshipLevel) {
                    result = true;
                } else {
                    result = false;
                }
            }
            return result;
        } else {
            return result;
        }
    }

    /**
     * Method to override hashcode method in Object class
     * @return The hash code of the Pikachu
     */
    @Override
    public int hashCode() {
        int primitive = 31;
        int result = super.hashCode();
        result = result * primitive + friendshipLevel;
        return result;
    }
}