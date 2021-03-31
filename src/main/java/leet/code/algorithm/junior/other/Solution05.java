package algorithm.junior.other;

import java.util.Deque;
import java.util.LinkedList;

public class Solution05 {
    public boolean isValid(String s) {

        Deque<Character> stack = new LinkedList<>();

        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new Solution05().isValid("()"));
    }
}
