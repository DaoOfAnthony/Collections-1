import java.util.Scanner;

/**
 * Write a description of class application here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Application
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Uses a stack to check if braces, brackets, and parentheses are balanced
     * in an expression
     * 
     * @return  a boolean if the expression in balanced
     */
    public boolean checkExpressions() {
        Scanner scan = new Scanner(System.in);
        String entered;
        
        System.out.println("Enter your expression");
        entered = scan.nextLine();
        return checkExpressions(entered);
    }
    
    public boolean checkExpressions(String expression) {
        MyStackLL<Character> bracketHolder = new MyStackLL<Character>();
        String openChars = "{([";
        String closedChars = "})]";
        
        for (int i = 0; i < expression.length(); i++) {
            if (openChars.indexOf(expression.charAt(i)) != -1) {
                bracketHolder.push(expression.charAt(i));
            } else if (closedChars.indexOf(expression.charAt(i)) != -1) {
                if (bracketHolder.isEmpty()) {
                    return false;
                }
                else if (! (openChars.indexOf(bracketHolder.getHead()) == 
                            closedChars.indexOf(expression.charAt(i)))) { // indexes are alligned
                    return false;
                } 
                else
                {
                    bracketHolder.pop();
                }
            }
        }
        return true;
    }
    
    public MyQueueLL reverseData() {
        Scanner scan = new Scanner(System.in);
        String entered;
        
        System.out.println("Enter your sentence to be reversed");
        entered = scan.nextLine();
        return reverseData(entered);
    }
    
    public MyQueueLL reverseData(String data) {
        MyQueueLL<Character> holder = new MyQueueLL<Character>();
        MyStackLL<Character> reversal = new MyStackLL<Character>();
        
        for (int i = 0; i < data.length(); i++) {
            holder.enqueue(data.charAt(i));
        }
        
        int size = holder.size();
        
        for (int i = 0; i < size; i++) {
            reversal.push(holder.dequeue());
        }
        
        for (int i = 0; i < size; i++) {
            holder.enqueue(reversal.pop());
        }
        return holder;
    }
    
    public int test1()
    {
        System.out.println(checkExpressions());
        return 5;
    }
    
    public int test2()
    {
        System.out.println(reverseData().toString());
        return 3;
    }
}
