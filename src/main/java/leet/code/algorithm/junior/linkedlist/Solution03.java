package algorithm.junior.linkedlist;

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
        if (head == null) {
            return null;
        }
        Deque<ListNode> deque = new LinkedList<>();
        while (head != null) {
            deque.push(head);
            head = head.next;
        }
        ListNode node = deque.poll();
        ListNode dummy = node;
        while (!deque.isEmpty()) {
            ListNode temp = deque.poll();
            node.next = temp;
            node = node.next;
        }
        node.next = null;
        return dummy;
    }

    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNode reverse = reverseList1(next);
        next.next = head;
        head.next = null;
        return reverse;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        new Solution03().reverseList(l1);
    }
}
