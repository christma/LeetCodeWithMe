package leet.code.other;

public class MSolution0402 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length);
    }
    private TreeNode helper(int[] nums,int left,int right){
        if(left==right){
            return null;
        }
        int mid=left+(right-left)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums,left,mid);
        node.right = helper(nums,mid+1,right);
        return node;
    }

}
