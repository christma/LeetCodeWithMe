package restart;

public class Solution563 {
    int sum = 0;

    public int findTilt(TreeNode root) {
        dfs(root);
        return sum;
    }

    private Integer dfs(TreeNode node) {
        if (node == null) return 0;
        int l = dfs(node.left);
        int r = dfs(node.right);
        sum += Math.abs(l - r);
        return l + r + node.val;
    }

}
