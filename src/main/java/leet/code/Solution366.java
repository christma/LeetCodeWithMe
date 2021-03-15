package leet.code;

import java.util.ArrayList;
import java.util.List;

public class Solution366 {
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

    public List<List<Integer>> findLeaves(TreeNode root) {

        List<List<Integer>> resList = new ArrayList<>();
        while (root != null) {
            List<Integer> list = new ArrayList<>();

            helper(root, list);
            resList.add(list);
        }
        return resList;
    }

    private TreeNode helper(TreeNode root, List<Integer> list) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return null;
        }
        root.left = helper(root.left, list);
        root.right = helper(root.right, list);
        return root;
    }
}
