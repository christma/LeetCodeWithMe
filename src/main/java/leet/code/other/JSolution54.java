package leet.code.other;

import java.util.PriorityQueue;

public class JSolution54 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public int kthLargest(TreeNode root, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        TreeAdd(pq, root, k);
        return pq.peek();
    }

    private void TreeAdd(PriorityQueue<Integer> pq, TreeNode node, int k) {

        if (node == null) {
            return;
        }
        pq.offer(node.val);
        if (pq.size() > k) {
            pq.poll();
        }
        TreeAdd(pq, node.left, k);
        TreeAdd(pq, node.right, k);

    }
}
