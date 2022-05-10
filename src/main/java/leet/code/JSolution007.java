package leet.code;

import java.util.PriorityQueue;

public class JSolution007 {

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

    public ListNode sortList(ListNode head) {
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>((a, b) -> a.val - b.val);
        while (head != null) {
            queue.offer(head);
            head = head.next;
        }

        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;

        while (queue.size() != 0) {
            cur.next = queue.poll();
            cur = cur.next;
        }
        cur.next = null;
        return dummyHead.next;

    }

}
