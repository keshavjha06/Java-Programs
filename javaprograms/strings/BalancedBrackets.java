package javaprograms.strings;
import java.util.Stack;

public class BalancedBrackets {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }

            if (stack.empty())
                return false;

            char stackSymbol = stack.pop();
            if (stackSymbol == '(' && c == ')')
                continue;

            if (stackSymbol == '[' && c == ']')
                continue;

            if (stackSymbol == '{' && c == '}')
                continue;

            return false;
        }

        return stack.empty();
    }

    // Driver code
    public static void main(String[] args) {
        String str = "{}()[]";

        // Function call
        if (isValid(str))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}