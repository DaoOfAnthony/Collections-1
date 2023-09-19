
/**
 * Write a description of class MyQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyQueue
{
    private int[] queue;
    private int front;
    private int back;
    private int size;

    /**
     * Constructor for objects of class MyQueue
     */
    public MyQueue(){
        queue = new int[10];
        front = 0;
        back = 0;
        size = 0;
    }

    /**
     * Add an element to the back of the queue
     *
     * @param  element  element to be enqueued
     */
    public void enqueue(int element) {
        
        // If the array is not full then add element to the queue
        if(!isFull()) {
            queue[back] = element;
            back = back + 1 % queue.length;
            size++;
        }
        
    }
    
    /**
     * Removes an element from the front of the queue
     * 
     * @return  dequed element
     */
    public int dequeue() {
        
        // If the queue is not empty, dequeue the front element
        if(!isEmpty()) {
            front++;
            return front - 1;
        }
        
        return Integer.MIN_VALUE;
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
    public int front() {
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
        int marker = front();
        
        while (marker!=back) {
            contents += queue[marker];
            marker = marker + 1 % queue.length;
        }
        
        contents += queue[back];
        return contents;
    }
}
