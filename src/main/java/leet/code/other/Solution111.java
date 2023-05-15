package leet.code.other;

public class Solution111 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if ((root.right == null) && (root.left == null)) {
            return 1;
        }
        int min_depth = Integer.MAX_VALUE;
        if (root.left != null) {
            min_depth = Math.min(min_depth, minDepth(root.left));
        }
        if (root.right != null) {
            min_depth = Math.min(min_depth, minDepth(root.right));
        }
        return min_depth + 1;
    }
}
