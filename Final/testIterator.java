// import java.util.*;
// public class testIterator {
//     public static void main(String[] args) {
//     Collection<String> collection = new ArrayList<>();
//     collection.add("New York"); 
//     collection.add("Atlanta"); 
//     collection.add("Dallas"); 
//     collection.add("Madison"); 
//     Iterator<String> iterator = collection.iterator();
//  		while (iterator.hasNext()) {
// 			System.out.print(iterator.next().toUpperCase() + " ");
// 		}
// 	System.out.println();
//     }
// }
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.HashSet;
public class testIterator{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList();
        HashMap<Integer, String> m = new HashMap();
        List<Integer> b = new ArrayList();
        b.add(9);
        b.add(5);
        b.add(4);
        b.add(3);
        System.out.println(b.get(0));
        HashSet<Integer> c = new HashSet();
        c.add(1);
        c.add(1);
        c.add(1);
        System.out.println(c.size());
    }   
}