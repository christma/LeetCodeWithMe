package leet.code;



import org.apache.commons.math3.util.Pair;

import java.util.LinkedList;
import java.util.List;

public class Solution104 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public int maxDepth(TreeNode root) {

        int ans = 0;
        if (root == null) {
            return ans;
        }
        LinkedList<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(root, 1));
        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> cur = queue.pollFirst();
            root = cur.getKey();
            int depth = cur.getValue();
            if (root != null) {
                ans = Math.max(depth, ans);
                queue.add(new Pair<>(root.left, depth + 1));
                queue.add(new Pair<>(root.right, depth + 1));
            }
        }
        return ans;
    }
}
