package leet.code.start20220510;

import java.util.LinkedList;

public class Solution101 {

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    private boolean check(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }

        return left.val == right.val && check(left.left, right.right) && check(left.right, right.left);
    }

    public boolean isSymmetric1(TreeNode root) {
        LinkedList<TreeNode> list = new LinkedList<>();
        list.offer(root);
        list.offer(root);
        while (!list.isEmpty()) {
            TreeNode left = list.poll();
            TreeNode right = list.poll();
            if (left == null && right == null) {
                continue;
            }

            if (left == null || right == null) {
                return false;
            }

            if (left.val != right.val) {
                return false;
            }

            list.offer(left.left);
            list.offer(right.right);
            list.offer(left.right);
            list.offer(right.left);

        }
        return true;

    }
}
