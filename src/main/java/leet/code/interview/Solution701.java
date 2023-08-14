package leet.code.interview;

/**
 * @Author Lyon
 * @Date 2023/8/14 08:19
 * @Version 1.0
 */

public class Solution701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        if(root.val > val) root.left = insertIntoBST(root.left,val);
        if(root.val < val) root.right = insertIntoBST(root.right,val);
        return root;
    }
}
