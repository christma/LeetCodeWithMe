package com.spring.leetCode;

import java.util.HashMap;
import java.util.Map;

public class Solution865 {
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

    Map<TreeNode, Integer> depth;
    int max_depth;

    public TreeNode subtreeWithAllDeepest(TreeNode root) {

        depth = new HashMap<>();
        depth.put(null, -1);
        dfs(root, null);
        max_depth = -1;
        for (Integer d : depth.values()) {
            max_depth = Math.max(max_depth, d);
        }
        return answer(root);
    }

    private TreeNode answer(TreeNode node) {
        if (node == null || depth.get(node) == max_depth) {
            return node;
        }

        TreeNode L = answer(node.left), R = answer(node.right);
        if (L != null && R != null) {
            return node;
        }
        if (L != null) {
            return L;
        }
        if (R != null) {
            return R;
        }
        return null;
    }

    private void dfs(TreeNode node, TreeNode parent) {
        if (node != null) {
            depth.put(node, depth.get(parent) + 1);
            dfs(node.left, node);
            dfs(node.right, node);
        }
    }
}
