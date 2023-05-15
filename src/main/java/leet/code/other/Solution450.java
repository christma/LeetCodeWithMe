package leet.code.other;


class Solution450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
            return root;
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
            return root;
        } else {
            if (root.left == null) {
                TreeNode rightNode = root.right;
                root.right = null;
                return rightNode;
            } else if (root.right == null) {
                TreeNode leftNode = root.left;
                root.left = null;
                return leftNode;
            } else {
                TreeNode succesor = minimum(root.right);
                succesor.right = removeMin(root.right);
                succesor.left = root.left;
                root.left = root.right = null;
                return succesor;
            }
        }
    }

    private TreeNode minimum(TreeNode root) {

        if (root.left == null) {
            return root;
        }
        return minimum(root.left);
    }

    private TreeNode removeMin(TreeNode node) {
        if (node.left == null) {
            TreeNode rightNode = node.right;
            node.right = null;
            return rightNode;
        }
        node.left = removeMin(node.left);
        return node;
    }
}