package leet.code.tesla;

public class Solution25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyHead = new ListNode(0);
        ListNode pre = dummyHead, tail;
        while (head != null) {
            tail = head;
            for (int i = 1; i < k; i++) {
                tail = tail.next;
                if (tail == null) {
                    pre.next = head;
                    return dummyHead.next;
                }
            }

            ListNode next = tail.next;
            reverse(head, tail);
            pre.next = tail;
            pre = head;
            head = next;
        }
        return dummyHead.next;

    }

    private void reverse(ListNode head, ListNode tail) {
        ListNode pre = null, cur = head, next;
        while (pre != tail) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
    }

}
