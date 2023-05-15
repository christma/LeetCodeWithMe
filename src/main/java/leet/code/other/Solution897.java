package leet.code.other;

public class Solution897 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    TreeNode cur;

    public TreeNode increasingBST(TreeNode root) {

        TreeNode ans = new TreeNode(0);
        cur = ans;
        inorder(root);
        return ans.right;
    }

    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);

        node.left = null;
        cur.right = node;
        cur = node;
        inorder(node.right);
    }

}
