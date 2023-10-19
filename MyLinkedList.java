import java.util.NoSuchElementException;

/**
 * Write a description of class MyLinkedList here.
 *
 * @author Connor Jordan
 * @version V1
 */
public class MyLinkedList<E> {
    // instance variables - replace the example below with your own
    private Node<E> head;
    private Node<E> tail;
    private int size;

    /**
     * Constructor for objects of class MyLinkedList
     */
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    /**
     * Gets the node at the passed in index
     * 
     * @param  index  the index of the node to be fetched
     * 
     * @return  the node at the desegnated index
     * 
     * @throws  NoSuchElementException  if index is bigger than size or less
     * than 0
     */
    public E get(int index) throws NoSuchElementException {
        if (index < 0 || index > size()-1) {
            Node<E> currNode = head;
            
            for (int i = 0; i<index; i++) {
                currNode = currNode.getNext();
            }
            return currNode.getData();
        } else {
            throw new NoSuchElementException();
        }
    }
     /**
      * adds a node at the desegnated index
      * 
      * @param  index  the location to insert the node
      * @param  element  the element type of the node
      * 
      * @throws  NoSuchElementException  if index is greater than size or less
      * than 0
      */
    public void add(int index, E element) throws NoSuchElementException {
        if(index < 0 || index >= size() + 1) {
            
        } else {
            throw new NoSuchElementException();
        }
    }    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  data  the data to be stored in the node
     */
    public void addHead(E data) {
        Node<E> newNode = new Node<E>(data);
        
        if(head == null) {
            head = newNode;
            tail = newNode;
            size++;
        } else {
            newNode.setNext(head);
            size++;
            head = newNode;
        }
    }
    
    /**
     * Adds an element to the back of the linked list
     */
    public void addTail(E data) {
        if (head == null) {
            addHead(data);
        } else {
            Node<E> newNode = new Node<E>(data);
            
            size++;
            Node<E> currNode = head;
            while(currNode.getNext() != null) {
                currNode = currNode.getNext();
            }
        
            currNode.setNext(newNode);
            tail = currNode.getNext();
        }
    }
    
    /**
     * removes the node at the desegnated index
     * 
     * @param  index  the index at which to remove the node
     * 
     * @return  the removed node
     * 
     * @throws  NoSuchElementException  if index is greater than size of less
     * than 0
     */
    public E remove(int index) throws NoSuchElementException {
        if (index > size() - 1 || index < 0) {
            
        } else {
            throw new NoSuchElementException();
        }
    }
    
    /**
     * Removes the first element in the linked list
     */
    public void removeHead() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException(); // handles error of empty list
        } else {
            head = head.getNext();
            size--;
        }
    }
    
    /**
     * Returns the first elemnent in the linked list
     * 
     * @return  the head of the linked list
     */
    public E getHead() throws NoSuchElementException {
        if(head == null) {
            throw new NoSuchElementException(); // handles error of empty list
        } else {
            return head.getData();
        }
    }
    
    /**
     * Checks to see if the array is empty
     * 
     * @return  if the array is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * Returns the number of elements in the linked list
     * 
     * @return  the size of the linked list
     */
    public int size() {
        return size;
    }
    
    /**
     * Returns the contents of the linked list from head to tail
     * 
     * @return  toString
     */
    public String toString() {
        String contents = "";
        
        Node<E> currNode = head;
        
        while (currNode.getNext() != null)
        {
            contents += currNode.getData() + " ";
            currNode = currNode.getNext();
        }
        contents += currNode.getData();
        
        return contents;
    }
}
