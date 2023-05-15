package leet.code.other;

public class Solution530 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int ans;
    int pre;


    public int getMinimumDifference(TreeNode root) {

        ans = Integer.MAX_VALUE;
        pre = -1;
        dsf(root);
        return ans;
    }

    private void dsf(TreeNode node) {
        if (node == null) {
            return;
        }
        dsf(node.left);
        if (pre == -1) {
            pre = node.val;
        } else {
            ans = Math.min(ans, node.val - pre);
            pre = node.val;
        }
        dsf(node.right);
    }

}
