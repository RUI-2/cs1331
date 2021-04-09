//I worked on the homework assignment alone, using only course materials.
/**
 * This class represents a chocolatebar object
 * @author Ruirui Ma
 * @version 1.0
 */
public class Bar {
    private String chocolateType;
    private int barLength;
    private int barWidth;

    /**
     * This method calculate the perimeter of the chocolatebar
     * @return The perimieter of the chocolatebar
     */
    public int getPerimeter() {
        return (2 * (barLength + barWidth));
    }

    /**
     * This method calculate the area of the chocolatebar
     * @return The area of the chocolatebar
     */
    public int getArea() {
        return (barLength * barWidth);
    }

    /**
     * This method determines whether the shape of the chocolatebar is a square or not
     * @return Whether the shape of the chocolatebar is a square or not
     */
    public boolean isSquare() {
        return (barLength == barWidth);
    }

    /**
     * This method calculate the cost of making the chocolatebar
     * @param chocolateCost The cost of chocolatebar per unit area
     * @param trimCost The cost of the trim that goes around the perimeter of the chocolatebar
     * @return The cost of making the chocolatebar, which includes the cost per unit area of chocolate and the cost of
     * the trim that will go around the bar’s perimeter.
     */
    public double calculateCost(double chocolateCost, double trimCost) {
        double areaCost = getArea() * chocolateCost;
        double perimeterCost = getPerimeter() * trimCost;
        return (areaCost + perimeterCost);
    }

    /**
     *This method describes the dimensions and the type of the chocolatebar
     * @return The length and width as well as the type of a rectangular chocolatebar or the area and type of the
     * chocolatebar if its shape is square.
     */
    public String getDetails() {
        if (isSquare()) {
            return ("Square " + getArea() + " piece bar of " + chocolateType + " chocolate");
        } else {
            return (barLength + " by " + barWidth + " bar of " + chocolateType + " chocolate");
        }
    }

    /**
     * This method draws out the dimensions of the chocolatebar using the capitalized first letter of the chocolate type
     */
    public void drawBar() {
        for (int j = 0; j < barLength; j++) {
            for (int i = 0; i < barWidth; i++) {
                System.out.print((chocolateType.toUpperCase()).charAt(0));
            }
            System.out.print("\n");
        }
    }

    /**
     * This constructor creates a chocolatebar of the type specified by chocolateType, of the dimensions specified by
     * barLength and barWidth
     * @param chocolateType The type of chocolatebar
     * @param barLength The length of the chocolatebar
     * @param barWidth The width of the chocolatebar
     */
    public Bar(String chocolateType, int barLength, int barWidth) {
        this.chocolateType = chocolateType;
        this.barLength = barLength;
        this.barWidth = barWidth;
    }
}