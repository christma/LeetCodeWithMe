package leet.code.tree;

import java.util.Deque;
import java.util.LinkedList;

public class Solution104 {
    public int maxDepth1(TreeNode root) {

        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }


    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        int ans = 0;
        while (!deque.isEmpty()) {
            int size = deque.size();
            while (size > 0) {
                TreeNode node = deque.poll();
                if (node.left != null) {
                    deque.offer(node.left);
                }
                if (node.right != null) {
                    deque.offer(node.right);
                }
                size--;
            }
            ans++;
        }
        return ans;

    }
}
