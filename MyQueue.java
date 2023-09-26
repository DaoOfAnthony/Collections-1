
/**
 * Write a description of class MyQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyQueue<E>
{
    private E[] queue;
    private int front;
    private int back;
    private int size;

    /**
     * Constructor for objects of class MyQueue
     */
    public MyQueue() {
        queue = (E[]) new Object[4];
        front = 0;
        back = 0;
        size = 0;
    }

    /**
     * Add an element to the back of the queue
     *
     * @param  element  element to be enqueued
     */
    public void enqueue(E element) {
        
        // If the array is not full then add element to the queue
        if (!isFull()) {
            queue[back] = element;
            back = (back + 1) % (queue.length);
            size++;
        }
        else
        {
            E error = queue[-1];
        }
        
    }
    
    /**
     * Removes an element from the front of the queue
     * 
     * @return  dequed element
     */
    public E dequeue() {
        
        // If the queue is not empty, dequeue the front element
        if (!isEmpty()) {
            int temp = front;
            front = (front + 1) % (queue.length);
            size--;
            return queue[temp];
        }
        
        return queue[-1];
    }
    
    /**
     * Indicates weather the queue contains any elements
     * 
     * @return  if the queue is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * Reads the element from the front of the queue
     * 
     * @return  front element
     */
    public E front() {
        return queue[front];
    }
    
    /**
     * Returns the number of elements at the front of the queue
     * 
     * @return  size of queue
     */
    public int size() {
        return size;
    }
    
    /**
     * Indicates weather the queue has exhasted its available storage
     * 
     * @return  if the queue is full
     */
    public boolean isFull() {
        return size == queue.length;
    }
    
    /**
     * Returns the contents of the queue from front to back
     * 
     * @return  toString
     */
    public String toString() {
        String contents = "";
        int totalBack = front + size; // back without the mod length
        
        /* 
         * Iteraties through the queue front to back and adds the 
         * values to contents 
         */
        for (int i = front; i < totalBack; i++) {
            contents += queue[i % queue.length] + " ";
        }
        
        return contents;
    }
}
