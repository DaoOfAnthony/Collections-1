
/**
 * A helper class for MyLinkedList that stores a data element and a pointer to
 * the next node in the list
 *
 * @author Connor Jordan
 * @version V1
 */
public class Node<E extends Comparable <E>>
{
    private E data;
    Node<E> next;

    /**
     * Constructor for objects of class Node
     */
    public Node(E data) {
        this.data = data;
        this.next = null;
    }

    /**
     * Reurns the data held in the node
     *
     * @return  data
     */
    public E getData() {
        return data;
    }
    
    /**
     * Sets the data held in the node
     */
    public void setData(E newData) {
        data = newData;
    }
    
    /**
     * Returns the next node in the linked list
     * 
     * @return  next node
     */
    public Node<E> getNext() {
        return next;
    }
    
    /**
     * Sets the next node in the linked list
     */
    public void setNext(Node<E> newNext) {
        next = newNext;
    }
}
