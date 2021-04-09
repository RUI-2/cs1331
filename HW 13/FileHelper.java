//I worked on the homework assignment alone, using only course materials.
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 * This file contains a class FileHelper
 * @author Ruirui Ma
 * @version 1.0
 */
public class FileHelper {
    /**
     * This method use helper method to list out the files and directories in the path
     * @param path The path to the file or directory
     */
    public static void printLs(String path) {
        printLsHelper(path, 0);
    }

    /**
     * This is a helper method to indent specific spaces
     * @param indent The number of indents desired
     */
    private static void helpIndent(int indent) {
        if (indent == 0) {
            System.out.print("");
        } else {
            System.out.print("    ");
            helpIndent(indent - 1);
        }
    }

    /**
     * This method list out the files and directories in the path with correct indentation levels
     * @param path The path to the file or directory
     * @param indentationLevel The level of indentations desired
     */
    private static void printLsHelper(String path, int indentationLevel) {
        Path aPath = Paths.get(path);
        if (!aPath.isAbsolute()) {
            Path absPath = Paths.get("").toAbsolutePath();
            aPath = Paths.get(absPath.toString() + path);
        }
        if (aPath.toFile().isFile()) {
            helpIndent(indentationLevel);
            System.out.println(aPath.toFile().getName());
        } else {
            File[] fList = aPath.toFile().listFiles();
            for (File temp : fList) {
                if (temp.isDirectory()) {
                    helpIndent(indentationLevel);
                    System.out.println(temp.getName());
                    printLsHelper(temp.getAbsolutePath(), indentationLevel + 1);
                } else {
                    printLsHelper(temp.getAbsolutePath(), indentationLevel);
                }
            }
        }
    }

    /**
     * This method prints the contents of the file desinated by path
     * @param path The path to the file or directory
     */
    public static void printCat(String path) throws CatException {
        Path aPath = Paths.get(path);
        if (!aPath.isAbsolute()) {
            Path absPath = Paths.get("").toAbsolutePath();
            aPath = Paths.get(absPath.toString() + path);
        }
        try {
            File aFile = new File(aPath.toString());
            Scanner scan = new Scanner(aFile);
            int count = 1;
            while (scan.hasNextLine()) {
                System.out.println(count + ": " + scan.nextLine());
                count++;
            }
        } catch (FileNotFoundException e) {
            throw new CatException("Path invalid. " + path, aPath.toString());
        }
    }
}

