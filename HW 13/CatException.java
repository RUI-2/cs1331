//I worked on the homework assignment alone, using only course materials.
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 * This file contains a class (Checked) CatExcepion that extends Exception
 * @author Ruirui Ma
 * @version 1.0
 */
public class CatException extends Exception {
    private final String problemFile;
    /**
     * Constructor create a CatException
     * @param message The problem message to be printed
     * @param problemFile The name of the problem file that causes the exception
     */
    public CatException(String message, String problemFile) {
        super(message);
        this.problemFile = problemFile;
    }
    @Override
    /**
     * This method returns the exception message of CatException
     */
    public String getMessage() {
        Path dir = Paths.get(problemFile);
        Path absDir = dir.toAbsolutePath();
        return (super.getMessage() + ". Problem witn file " + absDir.toString());
    }

}