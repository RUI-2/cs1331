//I worked on the homework assignment alone, using only course materials.
import java.util.ArrayList;
/**
 * This file contains the subclass of AbstractDex, Pokedex
 * @author Ruirui Ma
 * @version 1.0
 */
public class Pokedex extends AbstractDex<PokemonSpecies> {

    /**
     * Constructor create a Pokedex object that has an empty entries arraylist
     */
    public Pokedex() {
        entries = new ArrayList<>();
    }

    /**
     * Constructor to create a Pokedex object
     * @param initialEntries The entries arraylist passed in to initialize entries
     */
    public Pokedex(ArrayList<PokemonSpecies> initialEntries) {
        entries = initialEntries;
    }
}