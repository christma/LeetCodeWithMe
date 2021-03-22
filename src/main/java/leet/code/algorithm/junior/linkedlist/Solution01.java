package algorithm.junior.linkedlist;

public class Solution01 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;
    }
}
