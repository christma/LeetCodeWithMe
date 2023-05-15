package leet.code.other;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution199 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        Integer temp = null;
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            TreeNode node = queue.pollFirst();
            if (node != null) {
                temp = node.val;
                if (node.left != null) {
                    queue.addLast(node.left);
                }
                if (node.right != null) {
                    queue.addLast(node.right);
                }
            } else {
                if (temp != null) {
                    ans.add(temp);
                }
                temp = null;
                if(!queue.isEmpty()){
                    queue.addLast(null);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode a = new TreeNode(9);
        TreeNode b = new TreeNode(20);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(7);

        root.left = a;
        root.right = b;
        b.left = c;
        b.right = d;

        new Solution199().rightSideView(root).iterator();
    }
}
