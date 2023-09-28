import java.util.NoSuchElementException;

/**
 * Write a description of class MyLinkedList here.
 *
 * @author Connor Jordan
 * @version V1
 */
public class MyLinkedList
{
    // instance variables - replace the example below with your own
    private Node head;
    private int size;

    /**
     * Constructor for objects of class MyLinkedList
     */
    public MyLinkedList() {
        head = null;
        size = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  data  the data to be stored in the node
     */
    public void addHead(int data) {
        Node newNode = new Node(data);
        
        if(head == null) {
            head = newNode;
            size++;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }
    
    public void addTail(int data) {
        if (head != null) {
            Node newNode = new Node(data);
        
            Node currNode = head;
        
            while(currNode.getNext() != null) {
                currNode = currNode.getNext();
            }
        
            currNode.setNext(newNode);
            size++;
        }
    }
    
    public void removeHead() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException();
        }
        else
        {
            head = head.getNext();
        }
    }
    
    public Node getHead() {
        return head;
    }
    
    public int getSize() {
        return size;
    }
    
    public String toString() {
        String contents = "";
        
        Node currNode = head;
        
        while (currNode.getNext() != null)
        {
            contents += currNode.getData() + " ";
            currNode = currNode.getNext();
        }
        contents += currNode.getData();
        
        return contents;
    }
}
