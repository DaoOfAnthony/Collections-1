import java.util.NoSuchElementException;

/**
 * Write a description of class MyLinkedList here.
 *
 * @author Connor Jordan
 * @version V1
 */
public class MyLinkedList<E extends Comparable<E>> {
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
        if (index < 0 || index > size() - 1) {
            throw new NoSuchElementException();
        } else {
            Node<E> currNode = head;
            
            for (int i = 0; i < index; i++) {
                currNode = currNode.getNext();
            }
            return currNode.getData();
        }
    }
    
    /**
     * replaces existing element at specified index with specefied element
     * 
     * @param  index  the location of the node to set
     * @param  element  the element to insert
     * 
     * @throws NoSuchElementException if index is greater than size of less 
     * than 0
     */
    public void set(int index, E element) {
        if (index > size() - 1 || index < 0) {
            throw new NoSuchElementException();
        } else {
            Node<E> currNode = head;
            for(int i = 0; i < index; i++) {
                currNode = currNode.getNext();
            }
            currNode.setData(element);
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
    public void add(int index, E element) {
        Node<E> currNode = head;
        Node<E> newNode = new Node<E>(element);        
        if (index > size || index < 0) {
            throw new NoSuchElementException();
        }
        for (int i = 0; i < index - 1; i++) {
            currNode = currNode.getNext();
        }
        if (size == 0 || index == 0) {
            addHead(element);
        } else if (index == size) {
            addTail(element);
        } else {
            size++;
            newNode.setNext(currNode.getNext());
            currNode.setNext(newNode);
        }
    }
    
    /**
     * inserts an element into a sorted linked list
     */
    public void insertSorted(E element) {
        Node<E> currNode = head;
        int index = 0;
        
        while (currNode != null && currNode.getData().compareTo(element) < 0) {
            currNode = currNode.getNext();
            index++;
        }
        add(index, element);
        size++;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  element  the data to be stored in the node
     */
    public void addHead(E element) {
        Node<E> newNode = new Node<E>(element);
        
        if (head == null) {
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
     * 
     * @param  element  the element to be added in the tail
     */
    public void addTail(E element) {
        if (head == null) {
            addHead(element);
        } else {
            Node<E> newNode = new Node<E>(element);
            
            size++;
            tail.setNext(newNode);
            tail = newNode;
        
        }
    }
    
    /**
     * adds an element to the end of the linked list
     * 
     * @param  element  the element to be added
     */
    public void add(E element) {
        addTail(element);
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
    public E remove(int index) {
        if (index >= size() || index < 0) {
            throw new NoSuchElementException();
        } else if (index == 0) {
            return removeHead();
        } else {
            Node<E> currNode = head;
            
            for (int i = 0; i<index-1; i++) {
                currNode = currNode.getNext();
            }
            Node<E> next = currNode.getNext();
            
            if (index == size - 1) {
                currNode.setNext(null);
                tail = currNode;
            } else {
                currNode.setNext(next.getNext());
            }
            
            E toReturn = next.getData();
            next.setData(null);
            next.setNext(null);
            size--;
            return toReturn;
        }
    }
    
    /**
     * removes and returns the first occurrence of the matching element
     * 
     * @return  Element  returns the first coccurence of the element
     * 
     * @throws  NoSuchElementException  if the element does not occurr in the
     * linked list
     */
    public E remove(E element) {
        Node<E> currNode = head;
        int index = 0;
        
        while (currNode != null && currNode.getData().compareTo(element) != 0) {
            currNode = currNode.getNext();
            index++;
        }
        if (currNode == null) {
            return null;
        }
        return remove(index);
    }
    
    /**
     * Removes the first element in the linked list
     * 
     * @throws  NoSuchElementException  if the head is null
     */
    public E removeHead() {
        if (head == null) {
            throw new NoSuchElementException(); // handles error of empty list
        } else {
            E temp = head.getData();
            head = head.getNext();
            size--;
            return temp;
        }
    }
    
    /**
     * Returns the first elemnent in the linked list
     * 
     * @return  the head of the linked list
     * 
     * @throws  NoSuchElementException  if head is null
     */
    public E getHead() {
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
        if (head != null) {
            while (currNode.getNext() != null)
            {
                contents += currNode.getData() + ", ";
                currNode = currNode.getNext();
            }
            contents += currNode.getData();
        }
            return contents;
    }
}
