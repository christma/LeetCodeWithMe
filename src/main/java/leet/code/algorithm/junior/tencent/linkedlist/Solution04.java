package leet.code.algorithm.junior.tencent.linkedlist;

import java.util.PriorityQueue;

public class Solution04 {

    static class ListNode {
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

    class Status implements Comparable<Status> {


        int val;
        ListNode listNode;

        public Status(int val, ListNode listNode) {
            this.val = val;
            this.listNode = listNode;
        }

        @Override
        public int compareTo(Status o) {
            return this.val - o.val;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Status> queue = new PriorityQueue<>();
        for (ListNode listNode : lists) {
            if (listNode != null) {
                queue.offer(new Status(listNode.val, listNode));
            }
        }
        ListNode head = new ListNode();
        ListNode tail = head;
        while (!queue.isEmpty()) {
            Status status = queue.poll();
            tail.next = status.listNode;
            tail = tail.next;
            if (status.listNode.next != null) {
                queue.offer(new Status(status.listNode.next.val, status.listNode.next));
            }
        }
        return head.next;
    }
}
