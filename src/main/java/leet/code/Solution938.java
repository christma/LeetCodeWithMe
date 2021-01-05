package com.spring.leetCode;

public class Solution938 {
    public class TreeNode {
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

    public int rangeSumBST(TreeNode root, int low, int high) {
        int ans = 0;
        dfs(root, low, high);
        return ans;
    }

    private void dfs(TreeNode node, int low, int high) {
        if (node != null) {
            if (low <= node.val && node.val <= high) {
                ans += node.val;
            }
            if (low < node.val) {
                dfs(node.left, low, high);
            }
            if (high > node.val) {
                dfs(node.right, low, high);
            }

        }


    }
}
