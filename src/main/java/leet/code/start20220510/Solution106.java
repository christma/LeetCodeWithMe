package leet.code.start20220510;

import java.util.HashMap;
import java.util.Map;

public class Solution106 {
    Map<Integer, Integer> map = new HashMap<>();
    int[] post;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        post = postorder;
        return buildTree(0, inorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode buildTree(int is, int ie, int ps, int pe) {
        if (ie < is || pe < ps) return null;
        int root = post[pe];
        Integer ri = map.get(root);

        TreeNode treeNode = new TreeNode(root);
        treeNode.left = buildTree(is, ri - 1, ps, ps + ri - is - 1);
        treeNode.right = buildTree(ri + 1, ie, ps + ri - is, pe - 1);
        return treeNode;
    }

}
