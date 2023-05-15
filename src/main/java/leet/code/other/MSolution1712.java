package leet.code.other;

public class MSolution1712 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    TreeNode head = new TreeNode(-1);
    TreeNode perv = null;

    public TreeNode convertBiNode(TreeNode root) {
        helper(root);
        return head.right;

    }

    private void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.left);
        if (perv == null) {
            perv = root;
            head.right = root;
        } else {
            perv.right = root;
            perv = root;
        }
        root.left = null;
        helper(root.right);
    }
}
