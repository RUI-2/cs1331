//I worked on the homework assignment alone, using only course materials.
import java.util.ArrayList;

/**
 * This file contains abstract class AbstractDex, which implements Comparable interface
 * @param <T> The parameterized class type
 * @author Ruirui Ma
 * @version 1.0
 */

public abstract class AbstractDex<T extends Comparable<? super T>> {
    protected ArrayList<T> entries;
    private boolean sorted;

    /**
     * Constructor create a AbstractDex object that has an empty entries arraylist
     */
    public AbstractDex() {
        entries = new ArrayList<>();
    }

    /**
     * This method use insertion sort to sort the entries arraylist
     */
    public void insertionSort() {
        for (int i = 0; i < entries.size(); i++) {
            T key = entries.get(i);
            int j = i;
            while (j > 0  && ((key.compareTo(entries.get(j - 1)) < 0))) {
                entries.set(j, entries.get(j - 1));
                j--;
            }
            entries.set(j, key);
        }
        sorted = true;
    }

    /**
     * This method use selection sort to sort the entries arraylist
     */
    public void selectionSort() {
        for (int k = 0; k < entries.size(); k++) {
            T min = entries.get(k);
            for (int i = k; i < entries.size(); i++) {
                if ((min.compareTo(entries.get(i))) > 0) {
                    min = entries.get(i);
                }
            }
            entries.remove(min);
            entries.add(k, min);
        }
        sorted = true;
    }

    /**
     * This method use binary search to find the element passed in
     * @param element The element to be searched
     * @return The index at which the element is found
     */
    public int binarySearch(T element) {
        int left = 0;
        int right = entries.size() - 1;
        int rValue = -1;
        int mid = (left + right) / 2;
        if (entries.contains(element) && sorted) {
            while (element.compareTo(entries.get(mid)) != 0) {
                mid = (left + right) / 2;
                if (element.compareTo(entries.get(mid)) > 0) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            rValue = mid;
        } else {
            return rValue;
        }
        return rValue;
    }

    /**
     * This method use add element to the entries arraylist
     * @param newElement The element to be added
     */
    public void addToDex(T newElement) {
        boolean check = false;
        for (int i = 0; i < entries.size(); i++) {
            if ((newElement.compareTo(entries.get(i))) == 0) {
                check = true;
                break;
            }
        }
        if (!check) {
            entries.add(newElement);
            sorted = false;
        }
    }

    /**
     * This method defines what makes two AbstractDex equivalent
     * @param other The object passed in to be compared
     */
    @Override
    public boolean equals(Object other) {
        boolean result = false;
        if (this == other) {
            result = true;
        }
        if (other instanceof AbstractDex) {
            AbstractDex temp = (AbstractDex) other;
            if ((this.entries).equals(temp.entries)) {
                result = true;
            }
        }
        return result;
    }

    /**
     * Method to override hashcode method in Object class
     * @return The hash code of the AbstractDex
     */
    public int hashCode() {
        int primitive = 7;
        int result = 1;
        if (sorted) {
            result = primitive * result + 1;
        } else {
            result = primitive * result + 0;
        }
        result = primitive * result + entries.hashCode();
        return result;
    }

    /**
     * Method to return the string representation of the AbstractDex
     * @return The string representation of the AbstractDex
     */
    public String toString() {
        String returnString = "";
        for (int i = 0; i < entries.size(); i++) {
            returnString += (entries.get(i)).toString() + '\n';
        }
        return returnString;
    }

    /**
     * Method to return the entries
     * @return The arraylist entries
     */
    public ArrayList<T> getEntries() {
        return entries;
    }

    /**
     * Method to return the boolean result of whether entries arraylist is sorted
     * @return Whether entries is sorted
     */
    public boolean getSorted() {
        return sorted;
    }

    /**
     * Method to set a new entries arraylist
     * @param entries The entries to set
     */
    public void setEntries(ArrayList<T> entries) {
        this.entries = entries;
    }
}