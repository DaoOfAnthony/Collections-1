
/**
 * Write a description of class Node here.
 *
 * @author Connor Jordan
 * @version V1
 */
public class Node
{
    // instance variables - replace the example below with your own
    private int data;
    Node next;

    /**
     * Constructor for objects of class Node
     */
    public Node(int data)
    {
        // initialise instance variables
        this.data = data;
        this.next = null;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return  data
     */
    public int getData()
    {
        return data;
    }
    
    public void setData(int newData) {
        data = newData;
    }
    
    public Node getNext() {
        return next;
    }
    
    public void setNext(Node newNext) {
        next = newNext;
    }
}
