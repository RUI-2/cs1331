import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Sample Tester class for CS 1331 HW 16, Fall 2019
 * Feel free to modify this with your own tests! This tester is by no
 * means comprehensive, but should give you a general idea if your
 * list is working.
 * This tester does not check for correct Node next/prev pointers. It also
 * does not check that both head and tail are being used correctly.
 *
 * @author 1331 TAs
 * @version 1.3.3.1
 */
public class Tester {

    /**
     * Main method for teting
     * @param args unused parameter
     */
    public static void main(String[] args) {
        SimpleList<String> list = new MyLinkedList<>();
        List<String> correctList = Collections.emptyList(); // reference list guaranteed to be correct

        // Testing initial list
        assertEquals(true, list.isEmpty());
        assertEquals(0, list.size());
        assertEquals(correctList.toArray(), list.toArray());
        assertThrows(NullPointerException.class, () -> list.contains(null));
        assertThrows(NullPointerException.class, () -> list.removeElement(null));
        assertThrows(NullPointerException.class, () -> list.add(null));
        assertThrows(NullPointerException.class, () -> list.add(0, null));
        assertThrows(IllegalArgumentException.class, () -> list.get(0));
        assertThrows(IllegalArgumentException.class, () -> list.remove(0));

        list.add("Shishir");
        correctList = List.of("Shishir");

        // Testing list of size 1 ([Shishir])
        assertEquals(false, list.isEmpty());
        assertEquals(1, list.size());
        assertEquals(correctList.toArray(), list.toArray());
        assertEquals(true, list.contains("Shishir"));
        assertEquals(false, list.contains("Andrew"));
        for (int i = 0; i < correctList.size(); i++) {
            assertEquals(correctList.get(i), list.get(i));
        }
        assertThrows(IllegalArgumentException.class, () -> list.get(-1));
        assertThrows(IllegalArgumentException.class, () -> list.get(1));

        list.add(0, "Allison");
        list.add("Andrew");
        list.add(2, "Manny");
        list.add(4, "Emma");
        correctList = List.of("Andrew", "Allison", "Manny", "Shishir", "Emma");

        // Testing list of non-edge case size ([Andrew, Allison, Manny, Shishir, Emma])
        assertEquals(false, list.isEmpty());
        assertEquals(5, list.size());
        assertEquals(correctList.toArray(), list.toArray());
        assertEquals(true, list.contains("Shishir"));
        assertEquals(true, list.contains("Andrew"));
        assertEquals(false, list.contains("Lauren"));
        for (int i = 0; i < correctList.size(); i++) {
            assertEquals(correctList.get(i), list.get(i));
        }
        assertThrows(NullPointerException.class, () -> list.contains(null));
        assertThrows(NullPointerException.class, () -> list.removeElement(null));
        assertThrows(NullPointerException.class, () -> list.add(null));
        assertThrows(NullPointerException.class, () -> list.add(0, null));
        assertThrows(IllegalArgumentException.class, () -> list.get(-1));
        assertThrows(IllegalArgumentException.class, () -> list.get(5));
        assertThrows(IllegalArgumentException.class, () -> list.remove(-1));
        assertThrows(IllegalArgumentException.class, () -> list.remove(5));

        list.remove(0);
        list.remove(1);
        list.remove(2);
        correctList = List.of("Allison", "Shishir");

        // Testing list after removing by indicies ([Allison, Shishir])
        assertEquals(false, list.isEmpty());
        assertEquals(2, list.size());
        assertEquals(correctList.toArray(), list.toArray());
        assertEquals(true, list.contains("Shishir"));
        assertEquals(false, list.contains("Andrew"));
        for (int i = 0; i < correctList.size(); i++) {
            assertEquals(correctList.get(i), list.get(i));
        }
        assertThrows(IllegalArgumentException.class, () -> list.get(-1));
        assertThrows(IllegalArgumentException.class, () -> list.get(2));
        assertThrows(IllegalArgumentException.class, () -> list.remove(-1));
        assertThrows(IllegalArgumentException.class, () -> list.remove(2));

        list.add("Jack");
        list.add(3, "Felipe");
        list.add("Ryan"); // [Ryan, Jack, Allison, Shishir, Felipe]
        list.removeElement("Ryan");
        list.removeElement("Felipe");
        list.removeElement("Lauren");
        list.removeElement("Allison");
        correctList = List.of("Jack", "Shishir");

        // Testing list after removing by elements ([Jack, Shishir])
        assertEquals(false, list.isEmpty());
        assertEquals(2, list.size());
        assertEquals(correctList.toArray(), list.toArray());
        assertEquals(true, list.contains("Jack"));
        assertEquals(false, list.contains("Allison"));
        for (int i = 0; i < correctList.size(); i++) {
            assertEquals(correctList.get(i), list.get(i));
        }
        assertThrows(IllegalArgumentException.class, () -> list.get(-1));
        assertThrows(IllegalArgumentException.class, () -> list.get(2));
        assertThrows(IllegalArgumentException.class, () -> list.remove(-1));
        assertThrows(IllegalArgumentException.class, () -> list.remove(2));

        list.removeElement("Jack");
        list.removeElement("Shishir");
        correctList = Collections.emptyList();

        // Testing to see if the list is actually empty again
        assertEquals(true, list.isEmpty());
        assertEquals(0, list.size());
        assertEquals(correctList.toArray(), list.toArray());
        assertEquals(false, list.contains("Shishir"));
        assertThrows(IllegalArgumentException.class, () -> list.get(0));
        assertThrows(IllegalArgumentException.class, () -> list.remove(0));

        list.add("Charlie");
        list.add("Saira");
        list.remove(0);
        list.remove(0);
        correctList = Collections.emptyList();

        // Testing to see if the list is actually empty again when removing with indicies
        assertEquals(true, list.isEmpty());
        assertEquals(0, list.size());
        assertEquals(correctList.toArray(), list.toArray());
        assertEquals(false, list.contains("Saira"));
        assertThrows(IllegalArgumentException.class, () -> list.get(0));
        assertThrows(IllegalArgumentException.class, () -> list.remove(0));

        list.add("Harry");
        list.clear();
        correctList = Collections.emptyList();

        // Checking that clear() works on single element lists
        assertEquals(true, list.isEmpty());
        assertEquals(0, list.size());
        assertEquals(correctList.toArray(), list.toArray());
        assertThrows(IllegalArgumentException.class, () -> list.get(0));
        assertThrows(IllegalArgumentException.class, () -> list.remove(0));

        list.add("Prerna");
        list.add("Sumit");
        list.add("Carl");
        list.clear();
        correctList = Collections.emptyList();

        // Checking that clear() works on multiple element lists
        assertEquals(true, list.isEmpty());
        assertEquals(0, list.size());
        assertEquals(correctList.toArray(), list.toArray());
        assertThrows(IllegalArgumentException.class, () -> list.get(0));
        assertThrows(IllegalArgumentException.class, () -> list.remove(0));

        System.out.println("Passed tests.");
    }







    /*
        ================================================
        Utility methods for testing. Ignore if you want
        ================================================
     */

    private static void assertEquals(Object expected, Object actual) {
        if (!Arrays.deepEquals(new Object[] {expected}, new Object[] {actual})) {
            throw new AssertionError("\nExpected: " + string(expected) + "\nActual: " + string(actual));
        }
    }

    private static void assertThrows(Class<? extends Exception> expectedType, Runnable executable) {
        try {
            executable.run();
            throw new AssertionError("Expected: " + expectedType.getSimpleName() + ", but no exception was thrown.");
        } catch (Exception caught) {
            if (!expectedType.isInstance(caught)) {
                throw new AssertionError("Expected " + expectedType.getSimpleName() + " to be thrown"
                    + " but instead got " + caught.getClass().getSimpleName());
            }
        }
    }

    private static String string(Object obj) {
        if (obj instanceof Object[]) {
            return Arrays.deepToString((Object[]) obj);
        } else {
            return String.valueOf(obj);
        }
    }
}
