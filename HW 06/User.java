//I worked on the homework assignment alone, using only course materials.
/**
 * This class represents a water fountain oject
 * @author Ruirui Ma
 * @version 1.0
 */
public class User {
    private String username;
    private int password;
    private static int numUsers;
    private static User newestUser = null;
    private static boolean displayNewest = true;

    /**
     * This constructor creates a user of username specified by username, of the password by password;
     * increase number of users and sets the newest users to this user created by constructor
     * @param username The username of the user
     * @param password The password of the user
     */
    public User(String username, int password) {
        this.username = username;
        this.password = password;
        numUsers++;
        newestUser = this;
    }

    /**
     * This method sets the setDisplayNewest to user input
     * @param displayNewest The status of whether to display newest user or not.
     */
    public static void setDisplayNewest(boolean displayNewest) {
        User.displayNewest = displayNewest;
    }

    /**
     * This method returns the number of users created
     * @return The number of users so far
     */
    public static int getNumUsers() {
        return numUsers;
    }

    /**
     * This method returns username of the user
     * @return The username of the user
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method returns different welcome messages
     * @return Different welcome messages depending on the number of users and status of displayNewest
     */
    public static String getWelcomeMessage() {
        if (numUsers == 0) {
            return ("This site doesn't have any users yet!");
        } else if (!displayNewest) {
            return ("Welcome to our site! We have " + numUsers + " user(s) and counting!");
        } else {
            return (newestUser.username + " just joined our site! Please give them a warm welcome!");
        }
    }

    /**
     * This method changes the password of the user if the username and password matches
     * @param usernameInput The username the user types in
     * @param passwordInput The password of the user types in
     * @param newPassword The new password of the user wants to set
     */
    public void changePassword(String usernameInput, int passwordInput, int newPassword) {
        if ((this.username == usernameInput) && (this.password == passwordInput)) {
            this.password = newPassword;
        }
    }

    /**
     * This method checks if the username matches corresponding password
     * @param usernameInput The username the user types in
     * @param passwordInput The password of the user types in
     * @return If the username matches password
     */
    public boolean validLogin(String usernameInput, int passwordInput) {
        if ((this.username == usernameInput) && (this.password == passwordInput)) {
            return true;
        }
        return false;
    }
}