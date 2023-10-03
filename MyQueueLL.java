import java.util.NoSuchElementException;
import java.util.EmptyStackException;

/**
 * Creates a data structure using the queue format
 *
 * @author Connor Jordan
 * @version V1
 */
public class MyQueueLL<E> {
    private MyLinkedList<E> queue;

    /**
     * Constructor for objects of class MyQueue
     */
    public MyQueueLL() {
        queue = new MyLinkedList<E>();
    }

    /**
     * Add an element to the back of the queue
     *
     * @param  element  element to be enqueued
     */
    public void enqueue(E element) {
        queue.addTail(element);
    }
    
    /**
     * Removes an element from the front of the queue
     * 
     * @return  dequed element
     */
    public E dequeue() throws EmptyStackException{
        E temp = queue.getHead();
        
        queue.removeHead();
        return temp;
    }
    
    /**
     * Indicates weather the queue contains any elements
     * 
     * @return  if the queue is empty
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    /**
     * Reads the element from the front of the queue
     * 
     * @return  front element
     */
    public E front() {
        return queue.getHead();
    }
    
    /**
     * Returns the number of elements at the front of the queue
     * 
     * @return  size of queue
     */
    public int size() {
        return queue.size();
    }
    
    /**
     * Returns the contents of the queue from front to back
     * 
     * @return  toString
     */
    public String toString() {
        return queue.toString();
    }
}
