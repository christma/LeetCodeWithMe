package leet.code.interview;

public class Solution0202 {
    public int kthToLast(ListNode head, int k) {

        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;

    }
}
