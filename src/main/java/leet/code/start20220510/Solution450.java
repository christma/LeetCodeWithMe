package leet.code.start20220510;

public class Solution450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
            return root;
        }
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
            return root;
        }
        if (root.val == key) {
            if (root.left == null && root.right == null)
                return null;
            if (root.right == null)
                return root.left;
            if (root.left == null)
                return root.right;
            TreeNode suc = root.right;
            while (suc.left != null)
                suc = suc.left;
            root.right = deleteNode(root.right, suc.val);
            suc.right = root.right;
            suc.left = root.left;
            return suc;
        }
        return root;
    }
}
