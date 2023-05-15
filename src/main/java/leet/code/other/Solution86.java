package leet.code.other;

public class Solution86 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode partition(ListNode head, int x) {
        ListNode l1 = new ListNode(0);
        ListNode minP = l1;


        ListNode l2 = new ListNode(0);
        ListNode maxP = l2;

        while (head != null) {
            if (head.val < x) {
                minP.next = head;
                minP = head;
            } else {
                maxP.next = head;
                maxP = head;
            }
            head = head.next;
        }
        maxP.next = null;
        minP.next = l2.next;
        return l1.next;
    }

}
