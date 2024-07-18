package restart;

public class Solution404 {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, false);
    }
    private int sumOfLeftLeaves(TreeNode node, boolean flag) {
        if (node == null) return 0;

        if (flag && node.left == null && node.right == null) {
            return node.val;
        }
        int lsum = sumOfLeftLeaves(node.left, true);
        int rsum = sumOfLeftLeaves(node.right, false);

        return lsum + rsum;

    }

}
