package leet.code.other;

import java.util.Stack;

public class Solution150 {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        int a, b;
        for (String s : tokens) {
            switch (s) {
                case "+":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a + b);
                    break;
                case "-":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a - b);

                    break;
                case "*":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a * b);
                    break;
                case "/":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a / b);
                    break;
                default:
                    stack.push(Integer.valueOf(s));
                    break;
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] arr = {"2", "1", "+", "3", "*"};
        System.out.println(new Solution150().evalRPN(arr));
    }
}
