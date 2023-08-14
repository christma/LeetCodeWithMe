package leet.code.interview;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author Lyon
 * @Date 2023/8/14 08:01
 * @Version 1.0
 */

public class Solution700 {
//    public TreeNode searchBST(TreeNode root, int val) {
//        Deque<TreeNode> deque = new LinkedList<>();
//        deque.offerLast(root);
//        while (!deque.isEmpty()) {
//
//            TreeNode cur = deque.removeLast();
//            if (cur.val == val) {
//                return cur;
//            }
//            if (cur.left != null) deque.offerLast(cur.left);
//            if (cur.right != null) deque.offerLast(cur.right);
//        }
//        return null;
//    }
    // 递归
//    public TreeNode searchBST(TreeNode root, int val) {
//        if (root == null) return null;
//        if (root.val == val) return root;
//        return searchBST(val > root.val ? root.right : root.left,val);
//
//    }

    // 迭代
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        while (root != null) {
            if (root.val == val) {
                return root;
            }
            root = root.val > val ? root.left : root.right;
        }
        return null;

    }
}
