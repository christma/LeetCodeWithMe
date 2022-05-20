package leet.code.start20220510;

public class Solution109 {
    public TreeNode sortedListToBST(ListNode head) {
        return buildTree(head, null);
    }

    private TreeNode buildTree(ListNode left, ListNode right) {
        if (left == right) {
            return null;
        }
        ListNode mid = getMid(left, right);
        TreeNode root = new TreeNode(mid.val);
        root.left = buildTree(left, mid);
        root.right = buildTree(mid.next, right);
        return root;

    }

    private ListNode getMid(ListNode left, ListNode right) {
        ListNode fast = left;
        ListNode solw = left;
        while (fast != right && fast.next != right) {
            fast = fast.next.next;
            solw = solw.next;
        }
        return solw;
    }
}
