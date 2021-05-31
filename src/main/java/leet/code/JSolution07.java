package leet.code;

import java.util.HashMap;
import java.util.Map;

public class JSolution07 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private Map<Integer, Integer> indexMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        indexMap  = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return buildTree(preorder, inorder, 0, n - 1, 0, n - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
        if (preorder_left > preorder_right) {
            return null;
        }
        int preorder_root = preorder_left;
        int inorder_root = indexMap.get(preorder[preorder_root]);
        TreeNode root = new TreeNode(preorder[preorder_root]);
        int size_left_subTree = inorder_root - inorder_left;
        root.left = buildTree(preorder, inorder, preorder_left + 1, preorder_left + size_left_subTree, inorder_left, inorder_root - 1);
        root.right = buildTree(preorder, inorder, preorder_left + size_left_subTree + 1, preorder_right, inorder_root + 1, inorder_right);
        return root;
    }

}