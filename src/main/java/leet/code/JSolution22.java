package leet.code;

public class JSolution22 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {


        if (head == null) {
            return null;
        }
        ListNode node = head;
        int n = 0;
        while (head.next != null) {
            node = node.next;
            n++;
        }

        for (int i = 0; i < n - k; i++) {
            head = head.next;
        }
        return head;
    }
}
