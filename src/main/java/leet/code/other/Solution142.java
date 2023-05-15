package leet.code.other;


public class Solution142 {


    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode fast, slow;
        fast = slow = head;


        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (fast == slow) {
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }

        }
        return null;
    }

    public static void main(String[] args) {
        ListNode ls = new ListNode(1);
        ListNode ls1 = new ListNode(2);
        ls.next = ls1;
        ListNode listNode = new Solution142().detectCycle(ls);


        System.out.println(listNode.val);
    }

}
