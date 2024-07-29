package restart;

public class Solution530 {
    int ans, pre;
    public int getMinimumDifference(TreeNode root) {
        ans = Integer.MAX_VALUE;
        pre = -1;
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode node) {
        if (node == null) return;
        dfs(node.left);
        if (pre == -1) {
            pre = node.val;
        } else {
            ans = Math.min(ans, pre - node.val);
            pre = node.val;
        }
        dfs(node.right);
    }
}
