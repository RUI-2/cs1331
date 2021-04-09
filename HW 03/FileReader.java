d//I worked on the homework assignment alone, using only course materials.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        File commandsFile = new File(args[0]);
        Scanner inputFile = new Scanner(commandsFile);
        while (inputFile.hasNext()) {
            String command = inputFile.next();
            if (command.equals("allcaps")) {
                System.out.println(allCaps(inputFile.next()));
            }
            if (command.equals("power")) {
                System.out.println(power(inputFile.nextInt(), inputFile.nextInt()));
            }
            if (command.equals("substring")) {
                System.out.println(makeSubstring(inputFile.next(), inputFile.nextInt(), inputFile.nextInt()));
            }
        }
        inputFile.close();
    }
    // place the three required static methods here
    public static String allCaps(String str) {
        return str.toUpperCase();
    }
    public static double power(int base, int power) {
        return Math.pow(base, power);
    }
    public static String makeSubstring(String str, int startIndex, int endIndex) {
        if ((startIndex < 0) || (startIndex > str.length()) || (startIndex > endIndex) || (endIndex > str.length())) {
            return ("Invalid command");
        }
        return (str.substring(startIndex, endIndex));
    }
}