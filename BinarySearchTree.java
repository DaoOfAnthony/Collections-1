import java.util.NoSuchElementException;

/**
 * Creates an abstract data type modeled after a binary search tree
 *
 * @author Connor Jordan
 * @version V1
 */
public class BinarySearchTree<E extends Comparable<E>> {
    private int size;
    private BinarySearchTreeNode<E> root;

    /**
     * Constructor for objects of class BinarySearchTree
     */
    public BinarySearchTree() {
        size = 0;
        root = null;
    }

    /**
     * Inserts element into the binary search tree
     *
     * @param  element  element to be inserted
     */
    public void insert(E element) {
        if (isEmpty()) {
            root = new BinarySearchTreeNode<E>(element);
        } else {
            root.insert(element);
        }
        size++;
    }
    
    /**
     * Searches for and returns the matching element
     * 
     * @param  element  the element to be searched for
     * 
     * @return  the matching element
     */
    public E search(E element) {
        if (isEmpty()) {
            return null;
        } else {
            return root.search(element);
        }
    }
    
    /**
     * removes and returns the matching element
     * 
     * @param  the element to be removed
     * 
     * @return the matching element;
     */
    public E remove(E element) {
        if(!root.search(element).equals(element)) {
            return null;
        } else if () {
            
        }
        size--;
    }
    
    /**
     * Returns the minimum element in the binary serch tree
     * 
     * @return minimum element in the binary search tree
     */
    public E getMin() {
        if (isEmpty()) {
            return null;
        } else {
            return getMin();
        }
    }
    
    /**
     * Return the maximun element in the binary search tree
     * 
     * @return maximum element in the binary search tree
     */
    public E getMax() {
        if (size == 0) {
            return null;
        } else {
            return getMax();
        }
    }
    
    /**
     * Returns the number of levels in the binary search tree
     * 
     * @return the number of levels in the tree
     */
    public int getDepth() {
        if (isEmpty()) {
            return 0;
        } else {
            return root.getDepth();
        }
    }
    
    /**
     * Removes and returns the minimum element
     * 
     * @return the minimum element in the tree
     */
    public E removeMin() {
        if(isEmpty()) {
            return null;
        } else {
            return removeMin().getData();
        }
    }
    
    /**
     * Removes and returns the maximim element
     * 
     * @return the maximum element in the tree
     */
    public E removeMax() {
        if(isEmpty()) {
            return null;
        } else {
            return removeMax().getData();
        }
    }
    
    /**
     * Indicated weather the binary search tree is empty
     * 
     * @return is the binary search tree empty
     */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * Returns the number of elements in the binary search tree
     * 
     * @return the size of the binary search tree
     */
    public int size() {
        return size;
    }
    
    /**
     * prints all of the elements in order smallest to largest
     * 
     * @return  a string of all the elements lowest to highest 
     * seperated by commas
     */
    public String toString() {
        return "";
    }
}
