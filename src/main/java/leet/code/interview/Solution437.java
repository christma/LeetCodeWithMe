package leet.code.interview;

/**
 * @Author Lyon
 * @Date 2024/1/9 22:56
 * @Version 1.0
 */

public class Solution437 {
    public int pathSum(TreeNode root, int targetSum) {

        if (root == null) return 0;
        int count = countPaths(root, targetSum);
        count += pathSum(root.left, targetSum);
        count += pathSum(root.right, targetSum);
        return count;
    }

    public int countPaths(TreeNode node, long targetSum) {
        if (node == null) {
            return 0;
        }
        int count = 0;
        if (node.val == targetSum) {
            count++;
        }
        count += countPaths(node.left, targetSum - node.val);
        count += countPaths(node.right, targetSum - node.val);
        return count;
    }
}
