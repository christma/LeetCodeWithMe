package leet.code.interview;

/**
 * @Author Lyon
 * @Date 2024/2/22 07:55
 * @Version 1.0
 */

public class Solution669 {
    public TreeNode trimBST(TreeNode root, int low, int high) {

        if (root == null) return null;
        if (root.val > high)
            return trimBST(root.left, low, high);
        if (root.val < low)
            return trimBST(root.right, low, high);
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
}
