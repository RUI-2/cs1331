//I worked on the homework assignment alone, using only course materials.

/**
 * This file contains class PokemonSpecies, which implements Comparable interface
 * @author Ruirui Ma
 * @version 1.0
 */

public class PokemonSpecies implements Comparable<PokemonSpecies> {
    private final int speciesNumber;
    private final String speciesName;
    private String speciesNickname;
    private String description;
    /**
     * Constructor to create a PokemonSpecies object
     * @param speciesName The name of the species of the pokemon
     * @param speciesNumber The number of the species
     * @param speciesNickname The nickname of the species of the pokemon
     * @param description The description of the pokemon species
     */
    public PokemonSpecies(String speciesName, int speciesNumber, String speciesNickname, String description) {
        this.speciesName = speciesName;
        this.speciesNumber = speciesNumber;
        this.speciesNickname = speciesNickname;
        this.description = description;
    }

    /**
     * Constructor to create a PokemonSpecies object, the nickname and the description is default to null
     * @param speciesNickname The name of the species of the pokemon
     * @param speciesNumber The number of the species
     */
    public PokemonSpecies(String speciesNickname, int speciesNumber) {
        this(speciesNickname, speciesNumber, null, null);
    }

    /**
     * Method to specify how two pokemon species are compared
     * @param other The other pokemon species to be compared to
     * @return The result of the comparation
     */
    @Override
    public int compareTo(PokemonSpecies other) {
        Integer one = new Integer(this.speciesNumber);
        Integer two = new Integer(other.speciesNumber);
        return (one.compareTo(two));
    }

    /**
     * This method defines what makes two pokemon species equivalent
     * @param other The object passed in to be compared
     */
    @Override
    public boolean equals(Object other) {
        boolean result = false;
        if (this == other) {
            result = true;
        }
        if (other instanceof PokemonSpecies) {
            PokemonSpecies temp = (PokemonSpecies) other;
            if (this.speciesName == temp.speciesName && this.speciesNumber == temp.speciesNumber) {
                result = true;
            }
        }
        return result;
    }

    /**
     * Method to override hashcode method in Object class
     * @return The hash code of the Pokemon species
     */
    @Override
    public int hashCode() {
        int primitive = 17;
        int result = 1;
        result = result * primitive + speciesNumber;
        result = result * primitive + speciesName.hashCode();
        result = result * primitive + speciesNickname.hashCode();
        result = result * primitive + description.hashCode();
        return result;
    }

    /**
     * Method to return the string representation of the pokemon species
     * @return The string representation of the pokemon species
     */
    @Override
    public String toString() {
        return (speciesNumber + ": " + speciesName + ", the " + speciesNickname + " Pokemon. " + description);
    }

    /**
     * Method to return the number of the species of the pokemon
     * @return The name of the trainer of the pokemon
     */
    public int getSpeciesNumber() {
        return speciesNumber;
    }

    /**
     * Method to return the name of the pokemon species
     * @return The name of the pokemon species
     */
    public String getSpeciesName() {
        return speciesName;
    }

    /**
     * Method to return the nickname of the pokemon species
     * @return The nickname of the pokemon species
     */
    public String getSpeciesNickname() {
        return speciesNickname;
    }

    /**
     * Method to return the description of the pokemon species
     * @return The description of the pokemon species
     */
    public String getDescription() {
        return description;
    }
    /**
     * Method to set the nickname of the pokemon species
     * @param speciesNickname The new nickname for the pokemon species
     */
    public void setSpeciesNickname(String speciesNickname) {
        this.speciesNickname = speciesNickname;
    }

    /**
     * Method to set the description of the pokemon
     * @param description The new description of the pokemon species
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
