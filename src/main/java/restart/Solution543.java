package restart;

public class Solution543 {
    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return ans;
    }

    private Integer dfs(TreeNode node) {
        if (node == null) return 0;
        int L = dfs(node.left);
        int R = dfs(node.right);
        ans = Math.max(ans, L + R);
        return Math.max(L, R) + 1;
    }
}
