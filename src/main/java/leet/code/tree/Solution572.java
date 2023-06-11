package leet.code.tree;

public class Solution572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        return dfs(root, subRoot);
    }

    private boolean dfs(TreeNode r1, TreeNode r2) {
        if (r1 == null) return false;
        return check(r1, r2) || dfs(r1.left, r2) || dfs(r1.right, r2);
    }

    private boolean check(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) {
            return true;
        }
        if (r1 == null || r2 == null || r1.val != r2.val) {
            return false;
        }
        return check(r1.left, r2.left) && check(r1.right, r2.right);
    }
}
