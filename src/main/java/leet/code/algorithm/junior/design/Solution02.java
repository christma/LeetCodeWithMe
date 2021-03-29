package algorithm.junior.design;

public class Solution02 {

    class ListNode {
        public int val;
        public int min;
        public ListNode next;

        public ListNode(int val, int min, ListNode next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }


    private ListNode head;

    public Solution02() {

    }

    public void push(int val) {

        if (isEmpty()) {
            head = new ListNode(val, val, null);
        } else {
            head = new ListNode(val, Math.min(val, head.min), head);
        }
    }


    public void pop() {
        if (isEmpty()) {
            throw new IllegalStateException("stack is null");
        }
        head = head.next;
    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("stack is null");
        }
        return head.val;
    }

    public int getMin() {
        if (isEmpty()) {
            throw new IllegalStateException("stack is null");
        }
        return head.min;
    }

    private boolean isEmpty() {
        return null == head;
    }
}
