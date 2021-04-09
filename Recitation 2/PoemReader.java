import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PoemReader {

    /*
        Do not modify the "throws FileNotFoundException" in the method headers!

        You don't have to worry about exceptions for now, but removing this
        statement from the headers will make your code not compile.
     */

    public static void printFile(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }

    }

    public static int wordCount(File file, String word) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        int count=0;
        while (input.hasNext()) {
            if (input.next().equals(word)) {
                count++;
            }
        }

        return count;
    }

    public static int findLastOccurrence(File file, String word) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        int count = 0;
        int number = 0;
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.indexOf(word) != -1) {
                number = count;
            }
            count++;

            // Assume that the first line in the file is 'Line 0'
        }
        return number;
    }

    public static void main(String[] args) throws FileNotFoundException {

        /* 

        Testing:
        
        1) Try printing the file using the printFile method
        2) Try counting how many times the word "time" appears. Should be 4
        3) Try checking the last line the word "time" appears. Should be line 34

        */
        File commandsFile = new File(args[0]);
        printFile(commandsFile);
        System.out.println(wordCount(commandsFile, "a"));
        System.out.println(findLastOccurrence(commandsFile, "The"));
    }

}
