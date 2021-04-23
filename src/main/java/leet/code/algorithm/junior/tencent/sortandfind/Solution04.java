package leet.code.algorithm.junior.tencent.sortandfind;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution04 {
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

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ans = new ArrayList<>();
        ans = inOrder(root, ans);
        return ans.get(k - 1);
    }

    private List<Integer> inOrder(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return ans;
        }
        inOrder(root.left, ans);
        ans.add(root.val);
        inOrder(root.right, ans);
        return ans;
    }


}
