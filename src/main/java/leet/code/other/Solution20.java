package leet.code.other;

import java.util.Stack;

public class Solution20 {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty())
                    return false;
                char p = stack.peek();
                if ((p == '{' && c == '}') || (p == '(' && c == ')') || (p == '[' && c == ']'))
                    stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new Solution20().isValid("()[]{}"));
    }
}
