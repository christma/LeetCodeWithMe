package leet.code.algorithm.junior.tencent.sortandfind;

public class Solution06 {
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

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        getMaxSum(root);
        return maxSum;
    }

    private int getMaxSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(getMaxSum(root.left), 0);
        int right = Math.max(getMaxSum(root.right), 0);
        int sum = root.val + left + right;
        maxSum = Math.max(maxSum, sum);
        return root.val + Math.max(left, right);

    }
}
