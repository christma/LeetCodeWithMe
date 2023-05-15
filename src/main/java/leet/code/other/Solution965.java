package leet.code.other;

public class Solution965 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isUnivalTree(TreeNode root) {
        boolean left_cur = (root.left == null || (root.val == root.left.val && isUnivalTree(root.left)));
        boolean right_cut =(root.right == null || (root.val == root.right.val && isUnivalTree(root.right)));
        return left_cur && right_cut;
    }

}
