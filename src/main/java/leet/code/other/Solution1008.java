package leet.code.other;

public class Solution1008 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        if (n == 0) {
            return new TreeNode();
        }
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 1; i < n; i++) {
            build(root, preorder[i]);
        }
        return root;
    }

    private TreeNode build(TreeNode root, int i) {
        if (root == null) {
            return new TreeNode(i);
        }
        if (i < root.val) {
            root.left = build(root.left, i);
        } else if (i > root.val) {
            root.right = build(root, i);
        }
        return root;
    }
}
