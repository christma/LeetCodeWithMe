package leet.code.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author Lyon
 * @Date 2024/1/14 21:03
 * @Version 1.0
 */

public class Solution1110 {
    Set<Integer> toDeleteSet = new HashSet<>();
    List<TreeNode> forest = new ArrayList<>();

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for (int del : to_delete) {
            toDeleteSet.add(del);
        }
        dfs(root, true);
        return forest;
    }

    public TreeNode dfs(TreeNode node, boolean parentDelete) {
        boolean curDelete = toDeleteSet.contains(node.val);
        if (parentDelete && !curDelete) {
            forest.add(node);
        }
        TreeNode left = node.left, right = node.right;
        if (left != null) {
            node.left = dfs(left, curDelete);
        }
        if (right != null) {
            node.right = dfs(right, curDelete);
        }
        return curDelete ? null : node;
    }

}
