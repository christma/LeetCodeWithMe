package leet.code.start20220510;

import java.util.HashMap;
import java.util.Map;

public class JOfferSolution07 {
    Map<Integer, Integer> map = new HashMap<>();
    int[] preorder_copy;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int pre_length = preorder.length;
        int in_length = inorder.length;
        if (pre_length != in_length) {
            return null;
        }
        preorder_copy = inorder;
        for (int i = 0; i < in_length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(0, pre_length - 1, 0, in_length - 1);
    }

    private TreeNode buildTree(int pre_left, int pre_right, int in_left, int in_right) {
        if (pre_left > pre_right || in_left > in_right) {
            return null;
        }

        int pivot = preorder_copy[pre_left];
        TreeNode root = new TreeNode(pivot);
        Integer pivot_index = map.get(pivot);
        root.left = buildTree(pre_left + 1, pivot_index - in_left + pre_left, in_left, pivot_index - 1);
        root.right = buildTree(pivot_index - in_left + pre_left + 1, pre_right, pivot_index + 1, in_right);
        return root;

    }
}
