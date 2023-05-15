package leet.code.other;

public class Solution270 {
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

    int res;
    double min = Double.MAX_VALUE;

    public int closestValue(TreeNode root, double target) {

        if (root != null) {
            if (Math.abs(root.val - target) < min) {
                min = Math.abs(root.val - target);
                res = root.val;
            }
            closestValue(root.left, target);
            closestValue(root.right, target);
        }
        return res;
    }
}
