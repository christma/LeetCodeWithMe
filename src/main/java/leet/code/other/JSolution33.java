package leet.code.other;

import java.util.Stack;

public class JSolution33 {
        public boolean verifyPostorder(int[] postorder) {
            Stack<Integer> stack = new Stack<>();
            int root = Integer.MAX_VALUE;
            for(int i = postorder.length - 1; i >= 0; i--) {
                if(postorder[i] > root) return false;
                while(!stack.isEmpty() && stack.peek() > postorder[i])
                    root = stack.pop();
                stack.add(postorder[i]);
            }
            return true;

    }
}
