package leet.code.other;

import java.util.HashSet;
import java.util.Set;

public class Solution653 {


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

    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return find(root, k, set);
    }

    private boolean find(TreeNode node, int k, Set<Integer> set) {
        if (node == null) {
            return false;
        }

        if (set.contains(k - node.val)) {
            return true;
        }
        set.add(node.val);
        return find(node.left, k, set) || find(node.right, k, set);
    }

}
