package com.spring.leetCode;


import java.util.ArrayList;
import java.util.List;

public class JSolution68 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> path_p = getPath(root, p);
        List<TreeNode> path_q = getPath(root, q);
        TreeNode ans = null;
        for (int i = 0; i < path_p.size() && i < path_q.size(); i++) {
            if (path_p.get(i) == path_q.get(i)) {
                ans = path_p.get(i);
            } else {
                continue;
            }
        }
        return ans;
    }

    public List<TreeNode> getPath(TreeNode node, TreeNode n) {
        List<TreeNode> path = new ArrayList<TreeNode>();
        TreeNode root = node;
        while (root != n) {
            path.add(root);
            if (root.val > n.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        path.add(root);

        return path;
    }

}