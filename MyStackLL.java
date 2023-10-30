import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
 * Creates a data structure using the stack format
 *
 * @author Connor Jordan
 * @version V1
 */
public class MyStackLL<E extends Comparable<E>> {
    private MyLinkedList<E> stack;
    
    /**
     * Constructor for objects of class MyStack
     */
    public MyStackLL() {
        stack = new MyLinkedList<E>();
    }

    /**
     * Pushes an element onto the stack
     *
     * @param  element  the element to be pushed
     */
    public void push(E element) {
        stack.addHead(element);
    }
    
    /**
     * Pops an element off of the stack
     * 
     * @return  element that was popped
     */
    public E pop() throws EmptyStackException {
        E temp = stack.getHead(); // to store head after it is removed
        
        stack.removeHead();
        return temp;
    }
    
    /**
     * Indicates weather stack contains any elements
     * 
     * @return  if the stack is empty
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    /**
     * Reads the element at the top of the stack
     * 
     * @return  the data the element stores
     */
    public E top() {
        return stack.getHead();
    }
    
    /**
     * Returns the number of elements stored in the stack
     * 
     * @return  size of the array
     */
    public int size() {
        return stack.size();
    }
    
    /**
     * Returns the contents of the stack from top to bottom
     * 
     * @return toString 
     */
    public String toString() {
        return stack.toString();
    }
    
}
