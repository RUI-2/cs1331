//I worked on the homework assignment alone, using only course materials.

/**
 * The implementation of linked list
 * @author Ruirui Ma
 * @version 1.0
 * @param <E> The type of elements in this list
 */
public class MyLinkedList<E> implements SimpleList<E> {

    /*
        DO NOT MODFIY THIS PART
     */
    private class Node {
        private E data;
        private Node next;
        private Node prev;
        private Node(E data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    /*
        IMPLEMENT THE METHODS BELOW:
     */

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

    public void add(int index, E element) throws NullPointerException, IllegalArgumentException {
        if (element == null) {
            throw new NullPointerException();
        } else if (index < 0 || index > this.size()) {
            throw new IllegalArgumentException();
        }
        int count = 0;
        Node curr = head;
        Node insert = new Node(element);
        //if theres no node in the list
        if (head == null) {
            head = insert;
            tail = insert;
        } else {
            if (index == 0) {
                insert.next = head;
                head.prev = insert;
                head = insert;
            } else if (index == this.size()) {
                tail.next = insert;
                insert.prev = tail;
                tail = insert;
            } else {
                while (count < index) {
                    curr = curr.next;
                    count++;
                }
                insert.next = curr;
                insert.prev = curr.prev;
                (curr.prev).next = insert;
                curr.prev = insert;
            }
        }
    }

    /**
     * Add element to the beginning of the list.
     *
     * @param element Element to be added
     * @throws NullPointerException If element is null
     */
    public void add(E element) throws NullPointerException {
        if (element == null) {
            throw new NullPointerException();
        }
        Node insert = new Node(element);
        if (head == null) {
            head = insert;
            tail = insert;
        } else {
            insert.next = head;
            head.prev = insert;
            head = insert;
        }
    }

    /**
     * Retrieve element at a specific index.
     *
     * This method should not modify the list.
     *
     * @param index Index to fetch element from
     * @return Element fetched from list
     * @throws IllegalArgumentException If index is negative or if index is greater than or equal to size
     */
    public E get(int index) throws IllegalArgumentException {
        if (index < 0 || index > this.size() - 1) {
            throw new IllegalArgumentException();
        }
        int count = 0;
        Node curr = head;
        while (count < index) {
            curr = curr.next;
            count++;
        }
        return curr.data;
    }

    /**
     * Remove element at a specific index.
     *
     * @param index Index to remove element from
     * @throws IllegalArgumentException If index is negative or if index is greater than or equal to size
     */
    public void remove(int index) throws IllegalArgumentException {
        if (index < 0 || index > this.size() - 1) {
            throw new IllegalArgumentException();
        } else {
            int count = 0;
            Node curr = head;
            if (head == tail && index == 0) {
                head = null;
                tail = null;
            } else {
                if (index == 0) {
                    head = head.next;
                } else if (index == this.size() - 1) {
                    tail.prev.next = null;
                    tail = tail.prev;
                   // tail.prev.next = null;
                } else {
                    while (count < index) {
                        curr = curr.next;
                        count++;
                    }
                    curr.prev.next = curr.next;
                    curr.next.prev = curr.prev;
                }
            }
        }
    }
    /**
     * Remove the first instance of the element from the list.
     *
     * If the element does not exist in the list, do nothing.
     *
     * @param element Element to find and remove.
     * @throws NullPointerException If element is null
     */
    public void removeElement(E element) throws NullPointerException {
        if (element == null) {
            throw new NullPointerException();
        } else {
            Node curr = head;
            int count = 0;
            if (head == tail) {
                if (head.data == element) {
                    head = null;
                    tail = null;
                }
            } else {
                if (element == head.data) {
                    remove(0);
                } else if (element == tail.data) {
                    tail.prev.next = null;
                    tail = tail.prev;
                } else {
                    while (curr.next != null) {
                        if (curr.data != element) {
                            curr = curr.next;
                        } else {
                            curr.prev.next = curr.next;
                            curr.next.prev = curr.prev;
                            break;
                        }
                    }
                }
            }
        }
    }

    /**
     * Return whether the list contains a specific element.
     *
     * @param element Element to search for
     * @return True only if the element is found.
     * @throws NullPointerException If element is null
     */
    public boolean contains(E element) throws NullPointerException {
        if (element == null) {
            throw new NullPointerException();
        }
        Node curr = head;
        if (head == null) {
            return false;
        } else if (head == tail) {
            return (head.data == element);
        } else if (head.data == element) {
            return true;
        } else if (tail.data == element) {
            return true;
        } else {
            while (curr.next != null) {
                if (curr.data != element) {
                    curr = curr.next;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Return whether the list is empty.
     *
     * @return True only if the list is empty.
     */
    public boolean isEmpty() {
        return (this.size() == 0);
    }

    /**
     * Remove all elements from the list.
     */
    public void clear() {
        head = null;
        tail = null;
    }

    /**
     * Return the size of the list.
     *
     * @return the size of the list.
     */
    public int size() {
        if (head == null) {
            return 0;
        } else {
            int count = 1;
            Node curr = head;
            if (head == tail) {
                return 1;
            } else {
                while (curr.next != null) {
                    curr = curr.next;
                    count++;
                }
                return count;
            }
        }
    }
    /**
     * Creates and returns an array with the same elements as this list
     * @return An array with all of the elements which is the same size as the list
     */
    public Object[] toArray() {
        Object[] rArray = new Object[this.size()];
        Node curr = head;
        int count = 0;
        if (head == null) {
            return rArray;
        } else if (head == tail) {
            rArray[0] = head.data;
        } else {
            while (curr.next != null) {
                rArray[count] = curr.data;
                curr = curr.next;
                count++;
            }
            rArray[this.size() - 1] = tail.data;
        }
        return rArray;
    }
}
