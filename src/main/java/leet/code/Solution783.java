package com.spring.leetCode;

public class Solution783 {



    Integer prev, ans;

    public int minDiffInBST(TreeNode root) {
        prev = null;
        ans = Integer.MAX_VALUE;
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        if (prev != null) {
            ans = Math.min(ans, node.val - prev);
        }
        prev = node.val;
        dfs(node.right);
    }

    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(4);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(6);
        TreeNode t4 = new TreeNode(1);
        TreeNode t5 = new TreeNode(3);


        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;

        System.out.println(new Solution783().minDiffInBST(t1));
    }
}
