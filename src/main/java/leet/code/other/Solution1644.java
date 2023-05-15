package leet.code.other;

public class Solution1644 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (isExisted(root, p) && isExisted(root, q)) {
            return _lowestCommonAncestor(root, p, q);
        }
        return null;
    }

    private TreeNode _lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }

        TreeNode left = _lowestCommonAncestor(root.left, p, q);
        TreeNode right = _lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        if (left != null) {
            return left;
        }

        if (right != null) {
            return right;
        }
        return null;

    }

    private boolean isExisted(TreeNode root, TreeNode p) {
        if (root == null) {
            return false;
        }
        return root == p || isExisted(root.left, p) || isExisted(root.right, p);

    }
}
