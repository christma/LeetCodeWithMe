package leet.code.interview;


public class Solution0208 {
    public ListNode detectCycle(ListNode head) {

        if (head == null) return head;

        ListNode slow = head, fast = head;
        while (fast != null) {

            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (fast == slow) {
                ListNode pre = head;
                while (pre != slow) {
                    pre = pre.next;
                    slow = slow.next;
                }
                return pre;
            }
        }
        return null;
    }

}
