//I worked on the homework assignment alone, using only course materials.
/**
 * This file contains class Charmander, which is a child class of Pokemon
 * @author Ruirui Ma
 * @version 1.0
 */
public class Charmander extends Pokemon {
    private int flameLevel;

    /**
     * Constructor to create a Charmander object
     * @param trainerName The name of the trainer of the Charmander
     * @param health The current health of the Charmander
     * @param maxHealth The maximum health of the Charmander
     * @param flameLevel The flame level of the Charmander
     */
    public Charmander(String trainerName, int health, int maxHealth, int flameLevel) {
        super(trainerName, health, maxHealth);
        this.flameLevel = flameLevel;
    }

    /**
     * Copy constructor to copy a Charmander object
     * @param other The Charmander object to be copied
     */
    public Charmander(Charmander other) {
        super(other);
        this.flameLevel = other.flameLevel;
    }

    /**
     * This method defines what makes two Charmander equivalent
     * @param other The object passed in to be compared
     */
    @Override
    public boolean equals(Object other) {
        boolean result = super.equals(other);
        if (other instanceof Charmander) {
            Charmander c = (Charmander) other;
            if (this.flameLevel == c.flameLevel) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    /**
     * Method to override hashcode method in Object class
     * @return The hash code of the Charmander
     */
    @Override
    public int hashCode() {
        int primitive = 31;
        int result = super.hashCode();
        result = result * primitive + flameLevel;
        return result;
    }

    /**
     * This method damages the pokemon by specified by amount
     * @param amount The amount of damages pokemon gets
     * @param isWaterDamage Whether the damage dealt is water damage or not
     */

    public void damage(int amount, boolean isWaterDamage) {
        if (!isWaterDamage) {
            super.damage(amount);
        } else {
            super.damage(2 * amount);
        }
    }
}