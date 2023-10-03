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
        
        for (int i = 0; i<expression.length(); i++) {
            if (openChars.indexOf(expression.charAt(i)) != -1) {
                bracketHolder.push(expression.charAt(i));
            }
            if (closedChars.indexOf(expression.charAt(i)) != -1) {
                if (!bracketHolder.pop().equals(expression.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
