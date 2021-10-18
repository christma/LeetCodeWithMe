package leet.code;

public class Solution369 {

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

    public ListNode plusOne(ListNode head) {

        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode notNine = sentinel;

        while (head != null) {
            if (head.val != 9) {
                notNine = head;
            }
            head = head.next;
        }

        notNine.val++;
        notNine = notNine.next;

        while (notNine != null) {
            notNine.val = 0;
            notNine = notNine.next;
        }

        return sentinel.val != 0 ? sentinel : sentinel.next;


    }
}
