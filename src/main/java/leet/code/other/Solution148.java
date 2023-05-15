package leet.code.other;

public class Solution148 {

    public class ListNode {
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

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode first = head.next, slow = head;
        while (first != null && first.next != null) {
            slow = slow.next;
            first = first.next.next;
        }

        ListNode temp = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(temp);

        ListNode dummyHead = new ListNode(0);
        ListNode ans = dummyHead;
        while (left != null && right != null) {
            if (left.val < right.val) {
                dummyHead.next = left;
                left = left.next;
            } else {
                dummyHead.next = right;
                right = right.next;
            }
            dummyHead = dummyHead.next;
        }
        dummyHead.next = left != null ? left : right;
        return ans.next;
    }
}
