import java.util.Collections;
import java.util.*;
public class Search {
	public static List<Integer> myList = new ArrayList();
	// public static void selectionSort() {
	// 	int min = myList.get(0);
	// 	for (int i = 0; i < myList.size(); i++) {
	// 		for (int j = i; j < myList.size(); j++) {
	// 			if(myList.get(j) < min) {
	// 				min = myList.get(j);
	// 			}
	// 		}
	// 		myList.remove(min);
	// 		myList.add(i, min);
	// 	}
	// }

	public static void main(String[] args) {
		// myList.add(3);
		// myList.add(1);
		// myList.add(9);
		// myList.add(2);
		// Iterator<Integer> iter = myList.iterator();
		// System.out.println(iter.next());
		// System.out.println(myList.get(0));
		// Collections.sort(myList);
		// System.out.println(myList.get(0));
		Complex a[] = {new Complex(1), new Complex(2)};
		System.out.println(	a[0].myNum);
		System.out.println(	a[1].myNum);
	}
}

class Complex {
	public int myNum;
	public Complex(int a) {
		myNum = a;
	}
}