package leet.code.tree;

public class Solution404 {
    int ans = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root);
        return ans;

    }

    private void dfs(TreeNode root) {
        if(root == null) return;
        if(root.left != null){
            if(root.left.left == null && root.left.right == null){
                ans += root.left.val;
            }else {
                dfs(root.left);
            }
        }
        dfs(root.right);
    }
}
