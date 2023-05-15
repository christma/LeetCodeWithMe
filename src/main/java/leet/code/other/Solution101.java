package leet.code.other;

public class Solution101 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);


     /*  1
        / \
       2   2
        \   \
        3    3
       */
    }

    private boolean check(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.right, q.left) && check(p.left, q.right);
    }

}
