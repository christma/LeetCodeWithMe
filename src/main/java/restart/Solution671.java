package restart;

public class Solution671 {
    int ans;
    int rootValue;

    public int findSecondMinimumValue(TreeNode root) {
        ans = -1;
        rootValue = root.val;
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode node) {
        if (node == null) return;
        if (ans != -1 && node.val >= ans) return;
        if(node.val > rootValue) ans = node.val;
        dfs(node.left);
        dfs(node.right);
    }


}
