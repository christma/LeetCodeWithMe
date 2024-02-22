package leet.code.interview;

/**
 * @Author Lyon
 * @Date 2024/2/23 07:33
 * @Version 1.0
 */

public class Solution938 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        if(root.val > high)
            return rangeSumBST(root.left,low,high);
        if(root.val < low)
            return rangeSumBST(root.right,low,high);
        return root.val + rangeSumBST(root.left,low,high) + rangeSumBST(root.right,low,high);
    }
}
