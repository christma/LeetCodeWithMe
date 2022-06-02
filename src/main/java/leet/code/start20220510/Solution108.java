package leet.code.start20220510;

public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return tools(nums, 0, nums.length - 1);
    }

    private TreeNode tools(int[] nums, int left, int right) {
        if (left > right)
            return null;

        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = tools(nums, left, mid - 1);
        root.right = tools(nums, mid + 1, right);
        return root;

    }
}
