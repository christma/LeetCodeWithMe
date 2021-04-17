package leet.code.algorithm.junior.tencent.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class Solution08 {
    static class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {

            val = x;

            next = null;

        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }


    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            if (a != null) {
                a = a.next;
            } else {
                a = headB;
            }

            if (b != null) {
                b = b.next;
            } else {
                b = headA;
            }
        }
        return a;
    }

}
