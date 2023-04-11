package leet.code.interview;

import java.util.HashSet;

public class Solution0201 {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return head;
        }
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(head.val);
        ListNode cur = head;
        while (cur.next != null) {
            ListNode tempNode = cur.next;
            if (hashSet.add(tempNode.val)) {
                cur = cur.next;
            } else {
                cur.next = cur.next.next;
            }
        }

        return head;
    }
}
