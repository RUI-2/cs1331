import java.io.*;
import java.nio.file.*;
public class tempTest {
	private static int count = 0;
	public static void main(String[] args) {
		//Path a = Paths.get("HW 13");
		File b = new File("HW 13");
		//System.out.println(b.getAbsolutePath());
		Path a = Paths.get("C:/Users/ruisq/Desktop/Fall 2019/CS 1331/HW 13");
		File[] fList = a.toFile().listFiles();
		for (File temp : fList) {
			System.out.println(temp.getName());
		}
		//count = a.toFile().listFiles().length - 1;
		// System.out.println(helpCheck(a.toFile().listFiles()));
		// count = b.listFiles().length - 1;
		// System.out.println(helpCheck(b.listFiles()));
		// helpIndent(3);
		// System.out.println("2");
		// System.out.println(b.getAbsolutePath());

	}

		//int count = 0;
		//System.out.println(fList.length);
		// for (File temp : fList) {
		// 	System.out.println(temp.getName());
		// }
	public static boolean helpCheck(File[] fList) {
		boolean result = false;
		if(count == 0) {
			if (!fList[0].isDirectory())
				result = true;
			return result;
		} else {
			if (fList[count].isDirectory()) {
				return result;
			} else {
				count --;
				return (helpCheck(fList));
			}
		}
	}
	
	private static void helpIndent(int indent) {
		if (indent == 0) {
		} else {
			System.out.print("///|");
			helpIndent(indent - 1);
		}
	}
}