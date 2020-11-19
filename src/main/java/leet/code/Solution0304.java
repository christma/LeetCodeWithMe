package com.spring.leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution0304 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode[] listOfDepth(TreeNode tree) {
            LinkedList<TreeNode> queue = new LinkedList<>();
            List<ListNode> res = new ArrayList<>();
            ListNode dummy = new ListNode(0);
            queue.offer(tree);
            while (!queue.isEmpty()) {
                int size = queue.size();
                ListNode curr = dummy;
                for (int i = 0; i < size; i++) {
                    TreeNode treeNode = queue.poll();
                    curr.next = new ListNode(treeNode.val);
                    if (treeNode.left != null) {
                        queue.offer(treeNode.left);
                    }
                    if (treeNode.right != null) {
                        queue.offer(treeNode.right);
                    }
                    curr = curr.next;
                }
                res.add(dummy.next);
                dummy.next = null;
            }
            return res.toArray(new ListNode[]{});
        }
    }


}
