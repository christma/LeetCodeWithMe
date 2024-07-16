package restart;

public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return transform(nums, 0, nums.length - 1);
    }

    private TreeNode transform(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = transform(nums, left, mid - 1);
        node.right = transform(nums, mid + 1, right);
        return node;
    }
}
