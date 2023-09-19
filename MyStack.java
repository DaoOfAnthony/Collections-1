
/**
 * Write a description of class MyStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyStack
{
    private int[] stack;
    private int size;
    
    /**
     * Constructor for objects of class MyStack
     */
    public MyStack() {
        stack = new int[10];
        size = 0;
    }

    /**
     * Pushes an element onto the stack
     *
     * @param  element  the element to be pushed
     */
    public void push(int element) {
        
        // If the stack is not full add the element to the back
        if(!isFull()){
            stack[size] = element;
            size++;
        }
    }
    
    /**
     * Pops an element off of the stack
     * 
     * @return  element that was popped
     */
    public int pop() {
        if(!isEmpty()){
            size--;
            return stack[size];
        }
        return Integer.MIN_VALUE;
    }
    
    /**
     * Indicates weather stack contains any elements
     * 
     * @return  if the stack is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * Reads the element at the top of the stack
     * 
     * @return  the location of the top
     */
    public int top() {
        return size-1;
    }
    
    /**
     * Returns the number of elements stored in the stack
     * 
     * @return  size of the array
     */
    public int size() {
        return size;
    }
    
    /**
     * Indicates weather stack contains has exausted its available storage
     * 
     * @return  if the stack is empty
     */
    public boolean isFull() {
        return size == stack.length;
    }
    
    /**
     * Returns the contents of the stack from top to bottom
     * 
     * @return toString 
     */
    public String toString() {
        String contents = "";
        
        for (int i = size - 1; i >= 0; i--)
        {
            contents += stack[i] + " ";
        }
        
        return contents;
    }
    
    public static void test() {
        MyStack stack1 = new MyStack();
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
}
