package leet.code.other;



public class Solution124 {
    public static class TreeNode {
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

    int ans = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return ans;
    }


    public int maxGain(TreeNode root){
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, maxGain(root.left));
        int right = Math.max(0, maxGain(root.right));

        ans = Math.max(ans, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(-10);
        TreeNode t2 = new TreeNode(9);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(15);
        TreeNode t5 = new TreeNode(7);

        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t3.right = t5;

        System.out.println(new Solution124().maxPathSum(t1));
    }
}
