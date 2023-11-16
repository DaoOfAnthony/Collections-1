import java.util.NoSuchElementException;

/**
 * Write a description of class MyLinkedList here.
 *
 * @author Connor Jordan
 * @version V1
 */
public class MyLinkedList<E extends Comparable<E>> {
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
        if (index < 0 || index > size() - 1) { // deals with invalid index
            throw new NoSuchElementException();
        } else {
            return indexHelper(index).getData();
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
        if (index > size() - 1 || index < 0) { // deals with invalid index
            throw new NoSuchElementException();
        } else {
            Node<E> currNode = head;
            currNode = indexHelper(index);
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
        
        if (index < 0 || index > size) { // deals with invalid index
            throw new NoSuchElementException();
        } else if (index == 0) { // adding head deals with empty and non-empty
            addHead(element);
        } else if (index == size) {
            addTail(element);
        } else {
            Node<E> newNode = new Node<E>(element);
            Node<E> currNode = indexHelper(index);
            
            size++;
            newNode.setNext(currNode);
            newNode.setPrevious(currNode.getPrevious());
            newNode.getNext().setPrevious(newNode);
            newNode.getPrevious().setNext(newNode);
            
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
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  element  the data to be stored in the node
     */
    public void addHead(E element) {
        Node<E> newNode = new Node<E>(element);
        
        if (head == null) { // deals with empty list
            head = newNode;
            tail = newNode;
            size++;
        } else {
            newNode.setNext(head);
            newNode.getNext().setPrevious(newNode);
            head = newNode;
            size++;
        }
    }
    
    /**
     * Adds an element to the back of the linked list
     * 
     * @param  element  the element to be added in the tail
     */
    public void addTail(E element) {
        if (head == null) { // deals with empty list
            addHead(element);
        } else {
            Node<E> newNode = new Node<E>(element);
            
            newNode.setPrevious(tail);
            newNode.getPrevious().setNext(newNode);
            tail = newNode;
            size++;
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
        if (index >= size() || index < 0) { // deals with invalid index
            throw new NoSuchElementException();
        } else if (index == 0) {//index is at head
            return removeHead();
        } else {
            Node<E> removeNode = indexHelper(index);
            if(index == size - 1) {// index is at end of list
                removeNode.getPrevious().setNext(null);
                tail = removeNode.getPrevious();
                removeNode.setPrevious(null);
                size--;
                return removeNode.getData();
            } else {
                removeNode.getPrevious().setNext(removeNode.getNext());
                removeNode.getNext().setPrevious(removeNode.getPrevious());
                removeNode.setNext(null);
                removeNode.setPrevious(null);
                size--;
                return removeNode.getData();
            }
        }
    }
    
    /**
     * a helper method for finding the node at an index
     * 
     * @param  index  the index at which to return the node
     * @return        the node at the designated index
     */
    private Node<E> indexHelper(int index) {
        if (index < size / 2) { // index is in the first half of array
            Node<E> currNode = head;
            for (int i = 0; i < index; i++) {
                currNode = currNode.getNext();
            }
            return currNode;
        } else {
            Node<E> currNode = tail;
            for (int i = size - 1; i > index; i--) {
                currNode = currNode.getPrevious();
            }
            return currNode;
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
        if (currNode == null) { // if empty
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
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            Node<E> temp = head;
            
            if (size == 1) { // Removing only node
                tail = null;
                head = null;
            } else { // Not last node
                head.getNext().setPrevious(null);
                head = head.getNext(); 
            }
            size--;
            temp.setNext(null);
            return temp.getData();
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
        if(head == null) { // deals with empty list
            throw new NoSuchElementException();
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
    
    public boolean integrityCheck() {
        Node<E> currNode = head;
        boolean integrity = true;
        if(currNode.getNext().getPrevious() == head) {
            currNode = currNode.getNext();
            for(int i = 0; i < size-2; i++) {
                if(!(currNode.getNext().getPrevious() == currNode &&
                        currNode.getPrevious().getNext() == currNode)) {
                    integrity = false;
                }
                currNode = currNode.getNext();
            }
            if(!(currNode.getPrevious().getNext() == currNode)) {
                integrity = false;
            }
        } else {
            integrity = false;
        }
        return integrity;
    }
    
    /**
     * Returns the contents of the linked list from head to tail
     * 
     * @return  toString
     */
    public String toString() {
        String contents = "";
        
        Node<E> currNode = head;
        if (head != null) { // deals with empty list
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
