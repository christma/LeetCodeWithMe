package leet.code.interview;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author Lyon
 * @Date 2023/12/24 08:46
 * @Version 1.0
 */

public class Solution94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        while (root == null && !queue.isEmpty()) {
            while (root != null) {
                queue.push(root);
                root = root.left;
            }

            TreeNode node = queue.pop();
            ans.add(node.val);
            root = root.right;
        }
        return ans;
    }
}
