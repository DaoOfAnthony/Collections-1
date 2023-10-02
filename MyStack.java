import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
 * Creates a data structure using the stack format
 *
 * @author Connor Jordan
 * @version V1
 */
public class MyStack<E>
{
    private E[] stack;
    private int size;
    
    /**
     * Constructor for objects of class MyStack
     */
    public MyStack() {
        stack = (E[]) new Object[10];
        size = 0;
    }

    /**
     * Pushes an element onto the stack
     *
     * @param  element  the element to be pushed
     */
    public void push(E element) throws NoSuchElementException {
        
        // If the stack is not full add the element to the top
        if (!isFull()){
            stack[size] = element;
            size++;
        } else {
            throw new NoSuchElementException(); // an error if the array is full
        }
    }
    
    /**
     * Pops an element off of the stack
     * 
     * @return  element that was popped
     */
    public E pop() throws EmptyStackException {
        if (!isEmpty()){
            E temp;
            
            size--;
            temp = stack[size];
            stack[size] = null; // handles garbage colection
            return stack[size];
        }
        
        throw new EmptyStackException(); // an error if the array is empty
    }
    
    /**
     * Indicates weather stack contains any elements
     * 
     * @return  if the stack is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * Reads the element at the top of the stack
     * 
     * @return  the location of the top
     */
    public int top() {
        return size--;
    }
    
    /**
     * Returns the number of elements stored in the stack
     * 
     * @return  size of the array
     */
    public int size() {
        return size;
    }
    
    /**
     * Indicates weather stack contains has exausted its available storage
     * 
     * @return  if the stack is empty
     */
    public boolean isFull() {
        return size == stack.length;
    }
    
    /**
     * Returns the contents of the stack from top to bottom
     * 
     * @return toString 
     */
    public String toString() {
        String contents = "";
        
        /*
         * iterates through the stack top to bottom and ads 
         * each value to contents
         */
        for (int i = size - 1; i >= 0; i--)
        {
            contents += stack[i] + " ";
        }
        
        return contents;
    }
    
}
