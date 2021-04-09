//I worked on the homework assignment alone, using only course materials.
import java.util.ArrayList;
import java.util.Collections;
/**
 * This file contains class PokemonCenter
 * @author Ruirui Ma
 * @version 1.0
 */
public class PokemonCenter {
    private ArrayList<Pokemon> injured;
    private int nurses;
    /**
     * Constructor to create a PokemonCenter object
     * @param injured The array list of injured pokemon
     * @param nurses The number of nurses in pokemon center
     */
    public PokemonCenter(ArrayList<Pokemon> injured, int nurses) {
        this.injured = injured;
        this.nurses = nurses;
    }

    /**
     * Constructor to create a default PokemonCenter constructor
     */
    public PokemonCenter() {
        ArrayList<Pokemon> empty = new ArrayList<Pokemon>();
        this.injured = empty;
        this.nurses = 1;
    }

    /**
     * Method to add pokemon to the injured arraylist
     * @param pokemon The pokemon to be added to the injured arraylist
     * @return Whether the pokemon is added to the injured arraylist or not
     */
    public boolean add(Pokemon pokemon) {
        for (int i = 0; i < injured.size(); i++) {
            if (injured.get(i) == pokemon) {
                return false;
            }
        }
        injured.add(pokemon);
        return true;
    }

    /**
     * This method heals the pokemon by specified by amount
     * @param amount The amount of heal pokemon gets
     */
    public void heal(int amount) {
        int num = 0;
        if (nurses >= injured.size()) {
            num = injured.size();
        } else {
            num = nurses;
        }
        for (int i = 0; i < num; i++) {
            Pokemon temp = injured.get(i);
            temp.heal(amount);
            injured.remove(i);
            if (temp.getHealth() != temp.getMaxHealth()) {
                injured.add(temp);
            }
        }
    }

    /**
     * This method heals the pokemon by specified by amount
     * @param amount The amount of heal pokemon gets
     */
    public void healMostInjured(int amount) {
        ArrayList<Pokemon> tempArr = new ArrayList<>();
        for (int i = 0; i < injured.size(); i++) {
            tempArr.add(injured.get(i));
        }
        Collections.sort(tempArr);
        int num = 0;
        if (nurses >= injured.size()) {
            num = injured.size();
        } else {
            num = nurses;
        }
        for (int i = 0; i < num; i++) {
            Pokemon temp = tempArr.get(i);
            temp.heal(amount);
            injured.remove(i);
            if (temp.getHealth() != temp.getMaxHealth()) {
                injured.add(temp);
            }
        }
    }

    /**
     * Method to print out a PokemonCenter object
     * @return The string representation of PokemonCenter object
     */
    public String toString() {
        return ("This Pokemon Center has " + nurses + " nurses and " + injured.size() + " pokemon waiting to be seen.");
    }

}