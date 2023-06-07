package leet.code.tree;

public class Solution111 {
    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return root.left == null || root.right == null ? left + right + 1 : Math.min(left, right) + 1;
    }
}
