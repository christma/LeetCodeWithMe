package leet.code.algorithm.junior.tree2;

public class Solution01 {
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

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHight = maxDepth(root.left);
            int rightHight = maxDepth(root.right);
            return Math.max(leftHight, rightHight) + 1;
        }
    }
}
