/**
 * Contract for a simple list.
 *
 * @author CS1331 TAs
 * @version 1.0
 * @param <E> The type of elements in this list
 */
public interface SimpleList<E> {

    /**
     * Add element to a specific index.
     *
     * You can use this method to add to the end of a list.
     * This does NOT remove the element at an existing index.
     *
     * @param index Index to add element to
     * @param element Element to be added
     * @throws NullPointerException If element is null
     * @throws IllegalArgumentException If index is negative or greater than size
     */
    void add(int index, E element);

    /**
     * Add element to the beginning of the list.
     *
     * @param element Element to be added
     * @throws NullPointerException If element is null
     */
    void add(E element);

    /**
     * Retrieve element at a specific index.
     *
     * This method should not modify the list.
     *
     * @param index Index to fetch element from
     * @return Element fetched from list
     * @throws IllegalArgumentException If index is negative or if index is greater than or equal to size
     */
    E get(int index);

    /**
     * Remove element at a specific index.
     *
     * @param index Index to remove element from
     * @throws IllegalArgumentException If index is negative or if index is greater than or equal to size
     */
    void remove(int index);

    /**
     * Remove the first instance of the element from the list.
     *
     * If the element does not exist in the list, do nothing.
     *
     * @param element Element to find and remove.
     * @throws NullPointerException If element is null
     */
    void removeElement(E element);

    /**
     * Return whether the list contains a specific element.
     *
     * @param element Element to search for
     * @return True only if the element is found.
     * @throws NullPointerException If element is null
     */
    boolean contains(E element);

    /**
     * Return whether the list is empty.
     *
     * @return True only if the list is empty.
     */
    boolean isEmpty();


    /**
     * Remove all elements from the list.
     */
    void clear();

    /**
     * Return the size of the list.
     *
     * @return the size of the list.
     */
    int size();

    /**
     * Creates and returns an array with the same elements as this list
     * @return An array with all of the elements which is the same size as the list
     */
    Object[] toArray();
}
