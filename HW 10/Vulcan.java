//I worked on the homework assignment alone, using only course materials.
/**
 * This file contains the Vulcan class.  You will need to implement many
 * methods, variables, and a constructor in this class.
 *
 * This class should have exactly 2 instance variables, a String name, and a Rank rank.
 * name should never be able to be changed once initialized in the constructor.  What keyword would allow us to do this?
 *
 * It should also have exactly one constructor, which takes in String name and int rank.
 * It should assign name to its corresponding instance variable.
 * However, we must get the Rank enum value corresponding to int rank.  A rank = 0 corresponds to Rank.ENSIGN,
 * rank = 1 to Rank.LIEUTENANT, and so on.  Note that we can only obtain a valid rank if 0 <= rank <= 5.
 * So, if `int rank` is negative or greater than 5, initialize `Rank rank` to null.  Otherwise, obtain the corresponding
 * enum rank using Rank.values().
 *
 * It should also properly implement the getName() and getRank() methods from Officer.
 * Each of these should return its corresponding local instance variable.
 *
 * Additionally, you should implement getHomePlanet() from the abstract class Alien.  This will be an
 * overridden method.  It should simply return the String "Vulcan".
 *
 * You should also implement the overridden method boolean isPrime(int num) from the Logic interface.
 * You can assume num >= 1.
 * Note that one very notable difference exists between the implementation of this method and that of Android!!!
 *      It should work as follows:
 *         - If num is 1, return false
 *         - If num is 2 or 3, return true
 *         - Otherwise, obtain the square root of num.  If this value is not a whole number, call Math.ceil() on it.
 *           Then, cast it to an integer. Let this value be called "sqrt".
 *         - Vulcans can only do mental math to a certain extent, so if sqrt > 20, change it to 20 instead.
 *         - Return false if any of the numbers between 2 and sqrt, inclusive, divide evenly into num.
 *           That is, if any of num % 2, num % 3, ..., num % sqrt are 0. Otherwise, return true.
 *
 * You should create an additional overloaded method boolean isPrime(int num1, int num2)
 * This should return true only if num1 and num2 are prime according to the isPrime() method in this class.
 * Otherwise, return false.
 *
 * Additionally, the Vulcan class will implement 2 overridden methods from java.lang.Object.
 *  For the overridden method public String toString(), what should be returned is the String
 *  "[rankString] [name] from [homePlanet]", where rankString is the value returned by the interface method rankString()
 *  from Officer, name is the local instance variable name, and homePlanet is the value returned by
 *  getHomePlanet().
 *
 * For the overridden method public boolean equals(Object other), follow the following formula:
 *        First, check if other == this.  If it does, return true.
 *        Next, check if other instanceof Vulcan is false.  If it is false, return false.
 *        Otherwise, cast other to a Vulcan, and return true if its name and rank are equal
 *        to the name and rank of the current object.
 *
 * @author Ruirui Ma
 * @version 1.0
 */
public class Vulcan extends Alien implements Officer, Logic {
    private final String name;
    private Rank rank;

     /**
     * Constructor to create an Vulcan object
     * @param name The name of the vulcan
     * @param rank The rank of the vulcan
     */
    public Vulcan(String name, int rank) {
        this.name = name;
        if (rank < 0 || rank > 5) {
            this.rank = null;
        } else {
            Rank[] rList = Rank.values();
            this.rank = rList[rank];
        }
    }

    /**
     * Method to get name of the vulcan
     * @return The name of the vulcan
     */
    public String getName() {
        return this.name;
    }

    /**
     * Method to get rank of the vulcan
     * @return The rank of the vulcan
     */
    public Rank getRank() {
        return this.rank;
    }

    /**
     * Method to get home planet of vulcan
     * @return The string representaion of vulcan's home planet
     */
    @Override
    public String getHomePlanet() {
        return "Vulcan";
    }

    /**
     * Method to determine if a number is prime
     * @param num The number passed in
     * @return If the passed in number is prime or not
     */
    public boolean isPrime(int num) {
        int sqrt = 0;
        double temp = 0;
        if (num == 1) {
            return false;
        } else if (num == 2 || num == 3) {
            return true;
        } else {
            temp = Math.sqrt(num);
            temp = Math.ceil(temp);
            sqrt = (int) temp;
            if (sqrt > 20) {
                sqrt = 20;
            }
            for (int i = 2; i <= sqrt; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * Method to determine if a number is prime
     * @param num1 The number passed in
     * @param num2 The number passed in
     * @return If the passed in number is prime or not
     */
    public boolean isPrime(int num1, int num2) {
        if (isPrime(num1) && isPrime(num2)) {
            return true;
        }
        return false;
    }

    /**
     * Method to print out an vulcan object
     * @return The string representation of vulcan object
     */
    @Override
    public String toString() {
        return (rankString() + " " + getName() + " from " + getHomePlanet());
    }

    /**
     * Method to compare if two vulcan objects are equal
     * @param other The other object to be compared
     * @return If two objects are equal
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Vulcan) {
            Vulcan obj = (Vulcan) other;
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
