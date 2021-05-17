package leet.code.algorithm.junior.design2;

public class Solution02 {

    class ListNode {
        public int val;
        public int minVal;
        public ListNode next;

        public ListNode(int val, int minVal, ListNode next) {
            this.val = val;
            this.minVal = minVal;
            this.next = next;
        }
    }

    private ListNode listNode;

    public Solution02() {

    }

    public void push(int val) {
        if (isEmpty()) {
            listNode = new ListNode(val, val, null);
        } else {
            listNode = new ListNode(val, Math.min(val, listNode.minVal), listNode);
        }
    }

    private boolean isEmpty() {
        return null == listNode;
    }

    public void pop() {
        if (isEmpty()) {
            throw new IllegalStateException("stack is empty");
        }
        listNode = listNode.next;
    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("stack is empty");
        }
        return listNode.val;
    }

    public int getMin() {
        if (isEmpty()) {
            throw new IllegalStateException("stack is empty");
        }
        return listNode.minVal;
    }
}
