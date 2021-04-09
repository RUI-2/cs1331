//I worked on the homework assignment alone, using only course materials.
/**
 * This file contains the Human class.  You will need to implement many
 * methods, variables, and a constructor in this class.
 *
 * This class should have exactly 2 instance variables, a String name, and an int rank.
 * name should never be able to be changed once initialized in the constructor.  What keyword would allow us to do this?
 *
 * It should also have exactly one constructor, which takes in String name and int rank.
 * It should assign name to its corresponding instance variable.
 * However, we must get the Rank enum value corresponding to int rank.  A rank = 0 corresponds to Rank.ENSIGN,
 * rank = 1 to Rank.LIEUTENANT, and so on.  Note that we can only obtain a valid rank if 0 <= rank <= 5.
 * So, if `int rank` is negative or greater than 5, initialize `Rank rank` to null.
 * Otherwise, obtain the corresponding enum rank using Rank.values().
 *
 * It should also properly implement the getName() and getRank() methods from Officer.
 * Each of these should return its corresponding local instance variable.
 *
 * Additionally, the Human class will implement 2 overridden methods from java.lang.Object.
 * For the overridden method public String toString(), what should be returned is the String
 * "[rankString] [name]", where rankString is the value returned by the interface method rankString()
 * from Officer and where name is the local instance variable name.
 *
 * For the overridden method public boolean equals(Object other), follow the following formula:
 *        First, check if other == this.  If it does, return true.
 *        Next, check if other instanceof Human is false.  If it is false, return false.
 *        Otherwise, cast other to a Human, and return true if its name and rank are equal
 *        to the name and rank of the current object.
 *
 * @author Ruirui Ma
 * @version 1.0
 */
public class Human implements Officer {
    private final String name;
    private Rank rank;

    /**
     * Constructor to create an Human object
     * @param name The name of the human
     * @param rank The rank of the human
     */
    public Human(String name, int rank) {
        this.name = name;
        if (rank < 0 || rank > 5) {
            this.rank = null;
        } else {
            Rank[] rList = Rank.values();
            this.rank = rList[rank];
        }
    }

    /**
     * Method to get name of the human
     * @return The name of the human
     */
    public String getName() {
        return this.name;
    }

    /**
     * Method to get rank of the human
     * @return The rank of the human
     */
    public Rank getRank() {
        return this.rank;
    }

    /**
     * Method to print out an human object
     * @return The string representation of human object
     */
    @Override
    public String toString() {
        return (rankString() + " " + getName());
    }

    /**
     * Method to compare if two human objects are equal
     * @param other The other object to be compared
     * @return If two objects are equal
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Human) {
            Human obj = (Human) other;
            return (this.getName() == obj.getName() && this.getRank() == obj.getRank());
        }
        return false;
    }

    /**
     * Method to override hashcode method in Object class
     * @return The hash code of the Human object
     */
    @Override
    public int hashCode() {
        int primitive = 31;
        int result = 1;
        result = primitive * result + name.hashCode();
        result = primitive * result + rank.hashCode();
        return result;
    }

}