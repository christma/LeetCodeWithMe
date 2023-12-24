package leet.code.interview;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author Lyon
 * @Date 2023/12/23 16:31
 * @Version 1.0
 */

public class Solution230 {
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;

            }
            root = stack.pop();
            --k;
            if (k == 0) break;
            root = root.right;
        }
        return root.val;
    }

}
