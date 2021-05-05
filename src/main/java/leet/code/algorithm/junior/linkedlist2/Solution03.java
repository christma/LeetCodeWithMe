package leet.code.algorithm.junior.linkedlist2;

import java.util.Deque;
import java.util.LinkedList;

public class Solution03 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        Deque<ListNode> deque = new LinkedList<>();
        while (head != null) {
            deque.addFirst(head);
            head = head.next;
        }
        if (deque.isEmpty()) {
            return null;
        }
        ListNode node = deque.pop();
        ListNode demmyHead = node;
        while (!deque.isEmpty()) {
            ListNode temp = deque.pop();
            node.next = temp;
            node = node.next;
        }
        node.next = null;
        return demmyHead;
    }
}
