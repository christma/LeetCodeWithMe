package leet.code;

public class MSolution0412 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int count = 0;

    public int pathSum(TreeNode root, int sum) {

        if (root == null) {
            return 0;
        }
        dfs(root, 0, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return count;
    }

    private void dfs(TreeNode root, int buf, int sum) {
        if (root == null) {
            return;
        }
        if (buf + root.val == sum) {
            count++;
        }
        dfs(root.left, buf + root.val, sum);
        dfs(root.right, buf + root.val, sum);

    }
}
