package leet.code;




class Solution538 {

    public TreeNode convertBST(TreeNode root) {

        traverse(root);
        return root;
    }

    int sum = 0;

    private void traverse(TreeNode root) {
    if(root == null){
        return;
    }
    traverse(root.right);
    sum += root.val;
    root.val = sum;
    traverse(root.left);

    }
}
