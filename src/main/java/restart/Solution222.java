package restart;

import java.util.LinkedList;
import java.util.Queue;

public class Solution222 {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return left + right + 1;
    }

    public int countNodes2(TreeNode root) {
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.offer(root);
        int count = 0;
        while (!treeNodes.isEmpty()) {
            TreeNode peek = treeNodes.poll();
            if (peek == null) continue;
            count++;
            if (peek.left != null) treeNodes.offer(peek.left);
            if (peek.right != null) treeNodes.offer(peek.right);
        }
        return count;
    }
}
