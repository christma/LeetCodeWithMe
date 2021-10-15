package leet.code;

import java.util.Deque;
import java.util.LinkedList;

public class JSolution06 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int[] reversePrint(ListNode head) {
        Deque<Integer> deque = new LinkedList<Integer>();
        while (head != null) {
            deque.push(head.val);
            head = head.next;
        }
        int size = deque.size();
        int[] ans = new int[size];
        for (int i = 0; i <= size; i++) {
            System.out.println(deque.peekFirst());
            ans[i] = deque.poll();
        }
        return ans;
    }
}
