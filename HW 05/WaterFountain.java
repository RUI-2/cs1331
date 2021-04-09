//I worked on the homework assignment alone, using only course materials.
/**
 * This class represents a water fountain oject
 * @author Ruirui Ma
 * @version 1.0
 */
public class WaterFountain {
    private String modelName;
    private boolean requiresMaintenance;
    private int cupsPoured;
    private static int totalWaterFountains = 0;

    /**
     * The version of the water fountain is 2.0.0
     */
    public static final String SOFTWARE_VERSION = "2.0.0";

    /**
     * This constructor creates a water fountain of the model specified by modelName, of the cups poured by cupsPoured
     * @param modelName The model name of the water fountain
     * @param cupsPoured The number of cups poured on the water fountain
     */
    public WaterFountain(String modelName, int cupsPoured) {
        requiresMaintenance = false;
        totalWaterFountains += 1;
        this.modelName = modelName;
        this.cupsPoured = cupsPoured;
    }

    /**
     * This method get the water fountain's model
     * @return The name of the model of the water fountain
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * This method set the model of water fountain to modelName
     * @param modelName The desired new model name for the water fountain
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * This method returns if the water fountain needs maintenance or not
     * @return Whether the water fountain needs maintanence or not
     */
    public boolean getRequiresMaintenance() {
        return requiresMaintenance;
    }


    /**
     * This method sets maintenance status (whether it needs maintanece or not) to user input
     * @param requiresMaintenance The maintenance status user wants to set
     */
    public void setRequiresMaintenance(boolean requiresMaintenance) {
        this.requiresMaintenance = requiresMaintenance;
    }

    /**
     * This method returns if the water fountain needs maintenance or not
     * @return Whether the water fountain needs maintenance or not
     */
    public int getCupsPoured() {
        return cupsPoured;
    }

    /**
     * This method sets the cups poured on the water fountain to user input
     * @param cupsPoured The number of cups poured that user wants to set
     */
    public void setCupsPoured(int cupsPoured) {
        this.cupsPoured = cupsPoured;
    }

    /**
     * This method returns the total amount of water fountains created
     * @return The total amount of water fountains created
     */
    public int getTotalWaterFountains() {
        return totalWaterFountains;
    }

    /**
     * This method sets the total amount of water fountains to user input
     * @param totalWaterFountains The total amount of water fountains that user wants to set
     */
    public void setTotalWaterFountains(int totalWaterFountains) {
        this.totalWaterFountains = totalWaterFountains;
    }


    /**
     * This method increases the number of cups poured on the water fountain if the water
     * fountain does not require maintenance
     */
    public void pourCup() {
        if (!requiresMaintenance) {
            cupsPoured += 1;
        }
    }

    /**
     * This method checks if the two water fountains have the same model name, cups poured and software version
     * @param other The other water fountain
     * @return Whether two water fountains have the same model name, cups poured and software version
     */
    public boolean equals(WaterFountain other) {
        if ((this.modelName == other.modelName) && (this.cupsPoured == other.cupsPoured)
            && (this.SOFTWARE_VERSION == other.SOFTWARE_VERSION)) {
            return true;
        }
        return false;
    }

    /**
     * This method prints out the model name, cups poured, the software version of the water fountain and whether it
     * needs maintanece
     * @return The model name, cups poured, the software version of the water fountain and whether it needs maintanece
     */
    public String toString() {
        if (requiresMaintenance) {
            return (modelName + " has poured " + cupsPoured + " cups , requires maintenance, and is running version: ["
                + SOFTWARE_VERSION + "]");
        } else {
            return (modelName + " has poured " + cupsPoured
                + " cups , does not requires maintenance, and is running version: [" + SOFTWARE_VERSION + "]");
        }
    }
}