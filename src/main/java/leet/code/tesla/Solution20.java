package leet.code.tesla;

import java.util.Deque;
import java.util.LinkedList;

public class Solution20 {
    public boolean isValid(String s) {


        char[] c = s.toCharArray();
        int length = c.length;
        if (length % 2 != 0) {
            return false;
        }
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < c.length; i++) {
            char c1 = c[i];
            if (c1 == '(' || c1 == '{' || c1 == '[') {
                deque.addLast(c1);
            } else {
                if (deque.isEmpty()) return false;
                Character p = deque.peekLast();
                if ((p == '(' && c1 == ')') ||
                        (p == '{' && c1 == '}') ||
                        (p == '[' && c1 == ']')) {
                    deque.pollLast();
                } else return false;
            }

        }
        return deque.isEmpty();
    }


    public static void main(String[] args) {
        System.out.println(new Solution20().isValid("([}}])"));
    }
}
