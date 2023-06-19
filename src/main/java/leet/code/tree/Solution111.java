package leet.code.tree;

public class Solution111 {
    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return root.left == null || root.right == null ? left + right + 1 : Math.min(left, right) + 1;
    }


    public static void main(String[] args) {
        TreeNode t0 = new TreeNode(3);
        TreeNode t1 = new TreeNode(9);
        TreeNode t2 = new TreeNode(20);
        TreeNode t3 = new TreeNode(15);
        TreeNode t4 = new TreeNode(7);

        t0.left = t1;
        t0.right = t2;
        t2.left = t3;
        t3.right = t4;
        new Solution111().minDepth(t0);
    }
}
