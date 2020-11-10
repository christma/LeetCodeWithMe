package com.spring.leetCode;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution700 {
    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null) {
            return null;
        }
        if (val == root.val) {
            return root;
        } else if (val < root.val) {
            root.left = searchBST(root.left, val);
            return root.left;
        } else {
            root.right = searchBST(root.right, val);
            return root.right;
        }
    }
}
