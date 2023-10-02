
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    public static void testNode() {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        System.out.println(list.isEmpty());
        list.addTail(5);
        list.addHead(5);
        list.addHead(4);
        System.out.println(list.size());
        list.addTail(6);
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
        MyStack<Integer> stack1 = new MyStack();
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
        
    }
}
