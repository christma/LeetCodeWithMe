package leet.code;

public class Solution19 {

    public static class ListNode {
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

    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode fast, slow;
            fast = slow = head;
            for (int i = 0; i < n; i++) {
                fast = fast.next;
            }
            if (fast == null) {
                return head.next;
            }
            while (fast != null && fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return head;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        new Solution().removeNthFromEnd(listNode, 1);

    }

}
