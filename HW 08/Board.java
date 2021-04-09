//I worked on the homework assignment alone, using only course materials.
/**
 * This class represents Board
 * @author Ruirui Ma
 * @version 2.0
 */
public class Board {

    private Cell[][] universe;
    private int dimensionLength = 0;
    private int generationCount = 0;


    /**
     * Constructor to create a Board object
     * @param dimensionLength length to make universe Cell array, sets value of dimensionLength instance variable
     * @param seed Initial board state that contains non-zero values where there should be living cells
     */
    public Board(int dimensionLength, int[][] seed) {
        universe = new Cell[dimensionLength][dimensionLength];
        applySeed(seed);
    }

    /**
     * Initializing universe based on the seed
     * @param seed Initial board state that contains non-zero values where there should be living cells
     */
    private void applySeed(int[][] seed) {
        for (int i = 0; i < universe.length; i++) {
            for (int j = 0; j < universe[i].length; j++) {
                Cell defaultCell = new Cell();
                if (seed[i][j] != 0) {
                    defaultCell.setAlive(true);
                }
                universe[i][j] = defaultCell;
            }
        }
    }

    /**
     * The program moves one "step" forward, and the status of the next generation of Cells is calculated and applied
     */
    public void tick() {
        generationCount += 1;
        int size = universe.length;
        Cell[][] temp = new Cell[size][size];
        for (int i = 0; i < universe.length; i++) {
            for (int j = 0; j < universe[i].length; j++) {
                Cell tempCell = new Cell();
                tempCell.setAlive(universe[i][j].getAlive());
                temp[i][j] = tempCell;
            }
        }

        for (int i = 0; i < universe.length; i++) {
            for (int j = 0; j < universe[i].length; j++) {
                if (universe[i][j].getAlive()) {
                    if ((getAliveNeighbors(universe, i, j) < 2) || (getAliveNeighbors(universe, i, j) > 3))  {
                        temp[i][j].setAlive(false);
                    }
                } else {
                    if (getAliveNeighbors(universe, i, j) == 3) {
                        temp[i][j].setAlive(true);
                    }
                }
            }
        }
        universe = temp;
    }

    /**
     * Retrieve whether a Cell within a given Cell array is alive or dead/out of bounds.
     * @param arr 2D Cell array that contains living and dead Cells
     * @param x X location to query
     * @param y Y location to query
     * @return 1 if the queried Cell is alive, 0 otherwise.
     */
    private int getCellStatus(Cell[][] arr, int x, int y) {
        if (x < 0 || y < 0 || x >= arr.length
            || y >= arr[x].length || !arr[x][y].getAlive()) {
            return 0;
        }
        return 1;
    }

    /**
     * Count the number of alive neighbors a given Cell in a Cell array has.
     * @param arr 2D Cell array that contains living and dead Cells
     * @param x X location to query
     * @param y Y location to query
     * @return The number of alive neighbors the queried Cell has
     */
    private int getAliveNeighbors(Cell[][] arr, int x, int y) {
        int total = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                total += getCellStatus(arr, x + i, y + j);
            }
        }
        total -= getCellStatus(arr, x, y);
        return total;
    }

    /**
     * @return The backing array of the board
     */
    public Cell[][] getUniverse() {
        return universe;
    }

    /**
     * toString method that visualizes universe and the generationCount
     * @return String representation of this object
     */
    @Override
    public String toString() {
        String output = String.format("Generation: %s\n",  generationCount);
        for (int i = 0; i < universe.length; i++) {
            for (int j = 0; j < universe.length; j++) {
                output += (universe[i][j].getAlive() ? "[*]" : "[ ]");
            }
            output += "\n";
        }
        return output;
    }
}