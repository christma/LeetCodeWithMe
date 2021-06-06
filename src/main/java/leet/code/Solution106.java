package leet.code;

import java.util.HashMap;
import java.util.Map;

public class Solution106 {
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

    Map<Integer, Integer> map = new HashMap<>();
    int[] post;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }
        post = postorder;
        TreeNode root = buildTree(0, n - 1, 0, n - 1);
        return root;
    }

    private TreeNode buildTree(int is, int ie, int ps, int pe) {

        if (is > ie || ps > pe) {
            return null;
        }
        int root = post[pe];
        Integer ri = map.get(root);

        TreeNode node = new TreeNode(root);
        node.left = buildTree(is, ri - 1, ps, ps + ri - is - 1);
        node.right = buildTree(ri + 1, ie, ps + ri - is, pe - 1);


        return node;
    }
}
