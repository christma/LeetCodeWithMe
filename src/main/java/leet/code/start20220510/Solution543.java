package leet.code.start20220510;



public class Solution543 {
    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        dfs(root);
        return ans;

    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        ans = Math.max(ans, left + right);
        return Math.max(left, right) + 1;

    }

}
