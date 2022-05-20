package leet.code.start20220510;

import java.util.HashMap;
import java.util.Map;

public class Solution105 {


    Map<Integer, Integer> hashMap = new HashMap<>();
    int[] preO;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preLen = preorder.length;
        int inLen = inorder.length;
        if (preLen != inLen) {
            return null;
        }

        preO = preorder;
        for (int i = 0; i < inLen; i++) {
            hashMap.put(inorder[i], i);
        }
        return buildTree(0, preLen - 1, 0, inLen - 1);

    }

    private TreeNode buildTree(int preLeft, int preRight, int inLeft, int inRight) {
        if (preLeft > preRight || inLeft > inRight) {
            return null;
        }
        int pivot = preO[preLeft];
        TreeNode root = new TreeNode(pivot);
        Integer prvotIndex = hashMap.get(pivot);
        root.left = buildTree(preLeft + 1, prvotIndex - inLeft + preLeft, inLeft, prvotIndex - 1);
        root.right = buildTree(prvotIndex - inLeft + preLeft + 1, preRight, prvotIndex + 1, inRight);
        return root;
    }


}
