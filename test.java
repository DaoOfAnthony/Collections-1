import java.util.NoSuchElementException;
import java.util.ArrayList;

/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test {
    /*public static void testQueueLL() {
        MyQueueLL queue1 = new MyQueueLL();
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.toString());
        System.out.println(queue1.size());
        queue1.enqueue(4);
        System.out.println(queue1.toString());
        queue1.enqueue(5);
        System.out.println(queue1.toString());
        queue1.enqueue(6);
        System.out.println(queue1.toString());
        System.out.println(queue1.size());
        queue1.enqueue(7);
        System.out.println(queue1.toString());
    }
    
    public static void testStackLL() {
        MyStackLL<Integer> stack1 = new MyStackLL<Integer>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(5);
        System.out.println(stack1.pop());
        System.out.println(stack1.size());
        System.out.println(stack1.toString());
        stack1.push(6);
        stack1.push(6);
        System.out.println(stack1.size());
        System.out.println(stack1.pop());
        System.out.println(stack1.toString());
    }
    
    public static void testLL() {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        System.out.println(list.isEmpty());
        list.add(5);
        list.addHead(5);
        list.addHead(4);
        System.out.println(list.size());
        list.add(6);
        list.add(7);
        System.out.println(list.toString());
        list.removeHead();
        System.out.println(list.toString());
        System.out.println(list.isEmpty());
        System.out.println(list.getHead());
        list.removeHead();
        list.removeHead();
        list.getHead();
    }
    
    public static void testStack() {
        MyStack<Integer> stack1 = new MyStack<Integer>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(5);
        System.out.println(stack1.pop());
        System.out.println(stack1.size());
        stack1.push(6);
        stack1.push(6);
        System.out.println(stack1.size());
        System.out.println(stack1.pop());
        System.out.println(stack1.isFull());
        System.out.println(stack1.toString());
    }
    
    public static void testQueue() {
        MyQueue queue1 = new MyQueue();
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.toString());
        System.out.println(queue1.size());
        queue1.enqueue(4);
        System.out.println(queue1.toString());
        queue1.enqueue(5);
        System.out.println(queue1.toString());
        queue1.enqueue(6);
        System.out.println(queue1.toString());
        System.out.println(queue1.isFull());
        System.out.println(queue1.size());
        queue1.enqueue(7);
        System.out.println(queue1.toString());
    }*/
    /*public static void testCastaways() {
        String[] lastName = {"",
                                    "Grumby",
                                    "Howell",
                                    "Howell",
                                    "Grant",
                                    "Hinkley",
                                    "Summers"};
        String[] firstName = {"Gilligan",
                                    "Jonas",
                                    "Thurston",
                                    "Lovey",
                                    "Ginger",
                                    "Roy",
                                    "Mary Ann"};
        int[] score = {72, 85, 82, 96, 90, 96, 88};
        String[] gender = {"M", "M", "M", "F", "F", "M", "F"};
        MyLinkedList<Castaway> castaways = new MyLinkedList<Castaways>();
        for(int i = 0; i<7; i++) {
            Castaway cast = new Castaway(lastName[i], firstName[i], score[i]
                    , gender[i]);
            castaways.add(cast);
        }
        
        for(int i = 0; i<7; i++) {
            
        }
    }*/
        
    
    public static void testOtherThings() {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        if (!list.isEmpty()) {
            System.out.println("Failed isEmpty");
        }
        list.addHead(3);
        list.addHead(4);
        list.addHead(5);
        list.addHead(3);
        System.out.println(list.toString());
        if (list.getHead() != 3) {
            System.out.println("Failed getHead");
        }
        if (list.removeHead() != 3) {
            System.out.println("Failed removeHead");
        }
        if (!list.toString().equals("5, 4, 3")) {
            System.out.println("Failed removeHead " + list.toString());
        }
        list.addTail(2);
        if (!list.toString().equals("5, 4, 3, 2")) {
            System.out.println("Failed addTail " + list.toString());
        }
    }
    
    public static void testLL() {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.addHead(1);
        list.addHead(2);
        if (list.remove(1) == null) {
            System.out.println("Failed remove index, is null");
        }
        if (list.get(0) != 2) {
           System.out.println("Failed get " + list.get(1));
        }
        list.addHead(3);
        list.add(1, 4);
        if (!list.toString().equals("3, 4, 2")) {
            System.out.println("Failed add1 with index " + list.toString());
        }
        list.add(0, 9);
        if (!list.toString().equals("9, 3, 4, 2")) {
            System.out.println("Failed add2 with index " + list.toString());
        }
        if (list.getHead() != 9) {
            System.out.println("Your add method does not set the head variable when inserting at index 0");
        }
        list.add(4, 10);
        list.addTail(5);
        if (!list.toString().equals("9, 3, 4, 2, 10, 5")) {
            System.out.println("Your add method does not set the tail variable when inserting at the index equal to the size of the list  " + list.toString());
        }
        list.remove(5);
        list.remove(4);
        
        
        if (list.remove(0) != 9) {
            System.out.println("Failed remove index " + list.toString());
        }
        if (!list.toString().equals("3, 4, 2")) {
            System.out.println("Failed remove index " + list.toString());
        }
        
        list.add(3, 9);
        if (!list.toString().equals("3, 4, 2, 9")) {
            System.out.println("Failed add3 with index " + list.toString());
        }
        list.remove(3);
        
        
        list.set(1, 9);
        if (!list.toString().equals("3, 9, 2")) {
            System.out.println("Failed set " + list.toString());
        }
        list.insertSorted(4);
        if (!list.toString().equals("3, 4, 9, 2")) {
            System.out.println("Failed insertSorted " + list.toString());
        }
        if (list.remove(new Integer(2)) == null) {
            System.out.println("Failed remove element, is null");
        }
        if (!list.toString().equals("3, 4, 9")) {
            System.out.println("Failed remove element " + list.toString());
        }
        MyLinkedList<Integer> listSorted = new MyLinkedList<Integer>();
        listSorted.insertSorted(6);
        listSorted.insertSorted(2);
        listSorted.insertSorted(8);
        listSorted.insertSorted(9);
        listSorted.insertSorted(67);
        listSorted.insertSorted(0);
        listSorted.insertSorted(-6);
        if (!listSorted.toString().equals("-6, 0, 2, 6, 8, 9, 67")) {
            System.out.println("Failed insertSorted " + listSorted.toString());
        }
        
        
        
        MyStackLL<Integer> stack = new MyStackLL<Integer>();
        try {
            stack.pop();
        } catch (NoSuchElementException e){
            System.out.println("Tried to pop from an empty stack.");
        }
        try {
            stack.top();
        } catch (NoSuchElementException e){
            System.out.println("Tried to top from an empty stack");
        }
        if (!stack.isEmpty()){
            System.out.println("Failed isEmpty");
        }
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        if (stack.size() != 5){
            System.out.println("Failed size");
        }
        if (stack.top() != 5){
            System.out.println("Failed top");
        }
        if (stack.pop() != 5){
            System.out.println("Failed pop");
        }
        if (!stack.toString().equals("4, 3, 2, 1")) {
            System.out.println("Failed toString " + stack.toString());
        }
        
        MyQueueLL<Integer> queue = new MyQueueLL<Integer>();
        if (!queue.isEmpty()){
            System.out.println("Failed isEmpty");
        }
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        if (queue.size() != 5){
            System.out.println("Failed size");
        }
        if (queue.front() != 1){
            System.out.println("Failed front");
        }
        if (queue.dequeue() != 1){
            System.out.println("Failed dequeue");
        }
        if (!queue.toString().equals("2, 3, 4, 5")) {
            System.out.println("Failed toString " + queue.toString());
        }
    }

}
