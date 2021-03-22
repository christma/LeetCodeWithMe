package algorithm.junior.linkedlist;

public class Solution02 {
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

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummyhead = new ListNode(0, head);
        ListNode slow = dummyhead, fast = head;
        for (int i = 1; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {

            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummyhead.next;

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
        new Solution02().removeNthFromEnd(l1,2);
    }
}
