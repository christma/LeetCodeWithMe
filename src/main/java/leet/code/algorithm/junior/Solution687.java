package leet.code.algorithm.junior;

public class Solution687 {
    class TreeNode {
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

    int ans;

    public int longestUnivaluePath(TreeNode root) {
        ans = 0;
        arrowPath(root);
        return ans;
    }

    private int arrowPath(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = arrowPath(node.left);
        int right = arrowPath(node.right);
        int arrowLeft = 0, arrowRight = 0;
        if (node.left != null && node.val == node.left.val) {
            arrowLeft += left + 1;
        }

        if (node.right != null && node.val == node.right.val) {
            arrowRight += right + 1;
        }
        ans = Math.max(ans, arrowLeft + arrowRight);
        return Math.max(arrowLeft, arrowRight);
    }

}
