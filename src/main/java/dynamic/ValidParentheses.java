package dynamic;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s == null || s.length() == 0) return true;
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '(' || c == '[' || c == '{') {
                stack.add(c == '(' ? ')' : (c == '[' ? ']' : '}'));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character pop = stack.pop();
                if (pop != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }


    public static void main(String[] args) {
        System.out.println(isValid("(({[{}]}()))"));
    }
}
