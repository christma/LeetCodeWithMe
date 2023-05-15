package leet.code.other;

import java.util.Deque;
import java.util.LinkedList;

public class Solution958 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isCompleteTree(TreeNode root) {

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        boolean reachedEnd = false;
        while (!deque.isEmpty()) {
            TreeNode node = deque.poll();
            if (reachedEnd && node != null) {
                return false;
            }
            if (node == null) {
                reachedEnd = true;
                continue;
            }
            deque.offer(node.left);
            deque.offer(node.right);
        }
        return true;
    }
}
