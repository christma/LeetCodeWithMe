package com.spring.leetCode;

class TreeNode1 {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode1() {
    }

    TreeNode1(int val) {
        this.val = val;
    }

    TreeNode1(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution814 {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        root.left = pruneTree(root.left);   // 左子树剪枝，得到剪枝后左子树
        root.right = pruneTree(root.right); // 右子树剪枝，得到剪枝后右子树
        // 判断决定root结点是否需要剪掉：
        if (root.left == null && root.right == null && root.val == 0) {
            return null;
        }
        // 返回root这棵树剪枝后的结果
        return root;
    }
}