//I worked on the homework assignment alone, using only course materials.
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 * This file contains a class Tester
 * @author Ruirui Ma
 * @version 1.0
 */
public class Tester {
    /**
     * This main method list out the files and directories in the current path
     * @param args The path passed in that desinate a file to be printed
     */
    public static void main(String[] args) throws CatException {
        Path absPath = Paths.get("").toAbsolutePath();
        FileHelper.printLs(absPath.toString());
        String path = args[0];
        FileHelper.printCat(path);
    }
}