package leet.code;

public class Solution129 {
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

    int sum = 0;

    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return sum;
    }

    private void dfs(TreeNode root, int cur) {
        if (root == null) {
            return;
        }
        cur = cur * 10 + root.val;
        if (root.left == null && root.right == null) {
            sum += cur;
        }
        dfs(root.left, cur);
        dfs(root.right, cur);
    }
}
