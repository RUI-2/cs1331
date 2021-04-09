//I worked on the homework assignment alone, using only course materials.
import java.util.ArrayList;

/**
 * This file contains abstract class Pokemon, which implements Comparable interface
 * @author Ruirui Ma
 * @version 1.0
 */
public abstract class Pokemon implements Comparable<Pokemon> {
    private String trainerName;
    private int health;
    private int maxHealth;
    private ArrayList<Integer> medicalHistory;

    /**
     * Constructor to create a Pokemon object
     * @param trainerName The name of the trainer of the pokemon
     * @param health The current health of the pokemon
     * @param maxHealth The maximum health of the pokemon
     */
    public Pokemon(String trainerName, int health, int maxHealth) {
        this.trainerName = trainerName;
        this.health = health;
        this.maxHealth = maxHealth;
        medicalHistory = new ArrayList<>();
    }

    /**
     * Copy constructor to copy a Pokemon object
     * @param p The pokemon object to be copied
     */
    public Pokemon(Pokemon p) {
        this.trainerName = p.trainerName;
        this.health = p.health;
        this.maxHealth = p.maxHealth;
        medicalHistory = new ArrayList<>();
        for (int i = 0; i < p.medicalHistory.size(); i++) {
            (this.medicalHistory).add((p.medicalHistory).get(i));
        }
    }

    /**
     * This method heals the pokemon by specified by amount
     * @param amount The amount of heal pokemon gets
     */
    public void heal(int amount) {
        int oHealth = health;
        health += amount;
        if (health > maxHealth) {
            health = maxHealth;
        }
        medicalHistory.add(health - oHealth);
    }

    /**
     * This method damages the pokemon by specified by amount
     * @param amount The amount of damages pokemon gets
     */
    public void damage(int amount) {
        int oHealth = health;
        health -= amount;
        if (health < 0) {
            health = 0;
        }
        medicalHistory.add(health - oHealth);
    }

    /**
     * This method defines what makes two pokemon equivalent
     * @param other The object passed in to be compared
     */
    @Override
    public boolean equals(Object other) {
        boolean result = true;
        if (this == other) {
            return result;
        } else {
            if (other instanceof Pokemon) {
                Pokemon p = (Pokemon) other;
                if (this.trainerName == p.trainerName && this.health == p.health && this.maxHealth == p.maxHealth
                    && this.medicalHistory.size() == p.medicalHistory.size()) {
                    for (int i = 0; i < this.medicalHistory.size(); i++) {
                        if (!(this.medicalHistory.get(i) == p.medicalHistory.get(i))) {
                            result = false;
                            return result;
                        }
                    }
                } else {
                    result = false;
                }
            } else {
                result = false;
            }

        }
        return result;
    }

    /**
     * Method to override hashcode method in Object class
     * @return The hash code of the Pokemon
     */
    @Override
    public int hashCode() {
        int primitive = 31;
        int result = 1;
        result = result * primitive + this.maxHealth;
        return result;
    }

    /**
     * Method to return the trainerName of the pokemon
     * @return The name of the trainer of the pokemon
     */
    public String getName() {
        return this.trainerName;
    }

    /**
     * Method to return the health of the pokemon
     * @return The health of the pokemon
     */
    public int getHealth() {
        return this.health;
    }

    /**
     * Method to return the maximum health of the pokemon
     * @return The maximum health of the pokemon
     */
    public int getMaxHealth() {
        return this.maxHealth;
    }

    /**
     * Method to set the trainer's name of the pokemon
     * @param name The new name for the pokemon's trainer
     */
    public void setName(String name) {
        this.trainerName = name;
    }

    /**
     * Method to specify how two pokemons are compared
     * @param other The other pokemon to be compared to
     * @return The result of the comparation
     */
    @Override
    public int compareTo(Pokemon other) {
        if (this.health < other.health) {
            return -1;
        } else if (this.health > other.health) {
            return 1;
        } else {
            return 0;
        }
    }
}