import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
import java.util.HashMap;

public class ExpressionValidator {
    static boolean isValid(String str) {
        HashMap<Character, Character> hashMap = new HashMap<Character, Character>();
        hashMap.put('(', ')');
        hashMap.put('[', ']');
        hashMap.put('{', '}');

        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push(hashMap.get(ch));
            } else if(ch == ')' || ch == ']' || ch == '}') {
                if(!stack.isEmpty() && stack.peek() == ch) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) throws FileNotFoundException {
        // Advanced Level (mark 7 || 8)
        File oneExpressionFile = new File("one_expression.txt");
        Scanner scanner = new Scanner(oneExpressionFile);
        String str = scanner.nextLine();
        if(isValid(str)) {
            System.out.println("The expression in one_expression.txt is valid");
        } else {
            System.out.println("The expression in one_expression.txt is not valid");
        }
        scanner.close();

        // Advanced Level (mark 9 || 10)
        File threeExpressionsFile = new File("three_expressions.txt");
        scanner = new Scanner(threeExpressionsFile);
        for(int i = 1; i <= 3; ++i) {
            str = scanner.nextLine();
            if(isValid(str)) {
                System.out.println("Expression " + i + " in three_expressions.txt is valid");
            } else {
                System.out.println("Expression " + i + " in three_expressions.txt is not valid");
            }
        }
        scanner.close();
    }
}
