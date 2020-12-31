package com.spring.leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Solution652 {
    public static class TreeNode {
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

    HashMap<String, Integer> mamo = new HashMap<>();
    LinkedList<TreeNode> res = new LinkedList<>();


    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

        traverse(root);
        return res;
    }

    private String traverse(TreeNode node) {
        if (node == null) {
            return "#";
        }
        String left = traverse(node.left);
        String right = traverse(node.right);

        String subTree = left + "," + right + "," + node.val;
        int freq = mamo.getOrDefault(subTree, 0);
        if (freq == 1) {
            res.add(node);
        }
        mamo.put(subTree, freq + 1);
        return subTree;
    }
public boolean findTarget2(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            if (q.peek() != null) {
                TreeNode node = q.remove();
                if (set.contains(k - node.val)) {
                    return true;
                }
                set.add(node.val);
                q.add(node.right);
                q.add(node.left);
            } else {
                q.remove();
            }
        }
        return false;
    }

}
