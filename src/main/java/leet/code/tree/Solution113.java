package leet.code.tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution113 {
    List<List<Integer>> ans = new ArrayList<>();
    Deque<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return ans;

    }

    private void dfs(TreeNode root, int targetSum) {
        if (root == null) return;

        path.offerLast(root.val);
        targetSum -= root.val;
        if (root.left == null && root.right == null && targetSum == 0) {
            ans.add(new LinkedList<>(path));
        }
        dfs(root.left, targetSum);
        dfs(root.right, targetSum);
        path.pollLast();
    }
}
