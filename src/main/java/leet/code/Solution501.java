package leet.code;

import java.util.LinkedList;
import java.util.List;

public class Solution501 {
    class TreeNode {
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

    List<Integer> ans = new LinkedList<>();
    int base, count, maxCount;

    public int[] findMode(TreeNode root) {
        dfs(root);
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);

        }
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        update(root.val);
        dfs(root.right);
    }

    private void update(int val) {
        if (val == base) {
            ++count;
        } else {
            count = 1;
            base = val;
        }
        if (count == maxCount) {
            ans.add(val);
        }
        if (count > maxCount) {
            maxCount = count;
            ans.clear();
            ans.add(val);
        }
    }
}
