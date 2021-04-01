package leet.code;

public class JSolution24 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode ls1 = new ListNode(1);
        ListNode ls2 = new ListNode(2);
        ListNode ls3 = new ListNode(3);
        ListNode ls4 = new ListNode(4);
        ListNode ls5 = new ListNode(5);

        ls1.next = ls2;
        ls2.next = ls3;
        ls3.next = ls4;
        ls4.next = ls5;

        new JSolution24().reverseList(ls1);
    }
}
