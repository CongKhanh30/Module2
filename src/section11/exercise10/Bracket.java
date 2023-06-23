package section11.exercise10;

import java.util.Stack;

public class Bracket {
    public static boolean checkParentheses(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char sym = input.charAt(i);
            if (sym == '(' || sym == '[' || sym == '{') {
                stack.push(sym);
            } else if (sym == ')' || sym == ']' || sym == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char left = stack.pop();
                if (!isMatching(left, sym)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatching(char left, char right) {
        return (left == '(' && right == ')') ||
                (left == '[' && right == ']') ||
                (left == '{' && right == '}');
    }

    public static void main(String[] args) {
        String input1 = "((2 + 3) * 5)";
        System.out.println(checkParentheses(input1)); // true

        String input2 = "((2 + 3) * 5";
        System.out.println(checkParentheses(input2)); // false

        String input3 = "((2 + 3) * 5))";
        System.out.println(checkParentheses(input3)); // false

        String input4 = "({[()]})";
        System.out.println(checkParentheses(input4)); // true

        String input5 = "({[()])}";
        System.out.println(checkParentheses(input5)); // false
    }
}

