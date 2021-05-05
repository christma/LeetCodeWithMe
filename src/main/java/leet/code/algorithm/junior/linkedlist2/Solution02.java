package leet.code.algorithm.junior.linkedlist2;

public class Solution02 {
    class ListNode {
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = head;
        int length = getLength(head);
        int last = length - n;
        if (last == 0) {
            return head.next;
        }
        for (int i = 0; i < last - 1; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return head;
    }

    private int getLength(ListNode node) {
        int len = 0;
        while (node != null) {
            node = node.next;
            len++;

        }
        return len;
    }
}
