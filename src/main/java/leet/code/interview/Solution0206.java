package leet.code.interview;

import java.util.Stack;

public class Solution0206 {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode pos = head;
        while (pos!= null) {
            stack.push(pos);
            pos = pos.next;
        }

        while (head != null) {
            if (stack.pop().val != head.val) {
                return false;
            }
            head = head.next;
        }
        return true;

    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        boolean palindrome = new Solution0206().isPalindrome(n1);
        System.out.println(palindrome);

    }
}
