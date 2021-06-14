package leet.code;

public class Solution654 {
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

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }

    private TreeNode constructMaximumBinaryTree(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }

        int bone = findMax(nums, l, r);
        TreeNode root = new TreeNode(nums[bone]);
        root.left = constructMaximumBinaryTree(nums, l, bone - 1);
        root.right = constructMaximumBinaryTree(nums, bone + 1, r);
        return root;
    }

    private int findMax(int[] nums, int l, int r) {
        int max = Integer.MIN_VALUE, index = l;
        for (int i = l; i <= r; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }
        return index;
    }
}
