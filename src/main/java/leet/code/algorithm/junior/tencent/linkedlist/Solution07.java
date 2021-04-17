package leet.code.algorithm.junior.tencent.linkedlist;

public class Solution07 {
    static class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {

            val = x;

            next = null;

        }

    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null && fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }

        }
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
