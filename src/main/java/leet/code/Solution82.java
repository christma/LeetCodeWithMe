package leet.code;

public class Solution82 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode a = dummyHead;
        ListNode b = head;
        while (b != null && b.next != null) {
            if (a.next.val != b.next.val) {
                a = a.next;
                b = b.next;
            } else {
                while (b != null && b.next != null && a.next.val == b.next.val) {
                    b = b.next;
                }
                a.next = b.next;
                b = b.next;
            }
        }
        return dummyHead.next;
    }
}
