package leet.code.start20220510;

public class Solution965 {
    int flag;

    public boolean isUnivalTree(TreeNode root) {
        flag = root.val;
        return dfs(root);
    }

    private boolean dfs(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (flag != root.val) {
            return false;
        }
        return dfs(root.left) && dfs(root.right);
    }

    public boolean isUnivalTree1(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null) {
            if (root.val != root.left.val || !isUnivalTree(root.left)) {
                return false;
            }
        }
        if (root.right != null) {
            if (root.val != root.right.val || !isUnivalTree(root.right)) {
                return false;
            }
        }
        return true;

    }


}
