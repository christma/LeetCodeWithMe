package leet.code;

import java.util.LinkedList;
import java.util.List;

public class Solution1469 {
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


    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        dfs(root, res);
        return res;

    }

    private void dfs(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.right == null) {
            res.add(root.left.val);
        }
        if (root.right != null && root.left == null) {
            res.add(root.right.val);
        }
        dfs(root.left, res);
        dfs(root.right, res);
    }

}
