package leet.code.start20220510;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class JOfferSolution22 {
    public boolean verifyPostorder(int[] postorder) {

        Deque<Integer> deque = new LinkedList<>();
        int root = Integer.MAX_VALUE;
        for (int i = postorder.length - 1; i >= 0; i--) {
            if (postorder[i] > root) return false;
            while (!deque.isEmpty() && deque.peekLast() > postorder[i]) {
                root = deque.pollLast();
            }
            deque.offer(postorder[i]);
        }

        return true;
    }


    public static void main(String[] args) {
//        int[] nums = {1, 2, 5, 10, 6, 9, 4, 3};
        int[] nums = {4, 6, 12, 8, 16, 14, 10};
        JOfferSolution22 s = new JOfferSolution22();
        System.out.println(s.verifyPostorder(nums));
    }
}
