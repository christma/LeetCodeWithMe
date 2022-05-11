package leet.code.start20220510;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {

        LinkedList<TreeNode> linkedList = new LinkedList<>();
        ArrayList<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        linkedList.offer(root);
        while (!linkedList.isEmpty()) {
            int size = linkedList.size();
            List<Integer> list = new ArrayList<>();
            while (size > 0){
                TreeNode node = linkedList.poll();
                list.add(node.val);
                if (node.left != null) {
                    linkedList.offer(node.left);
                }
                if (node.right != null) {
                    linkedList.offer(node.right);
                }
                ans.add(list);
                size--;
            }
        }
        return ans;
    }
}
