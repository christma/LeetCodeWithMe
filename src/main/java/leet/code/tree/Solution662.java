package leet.code.tree;


import org.apache.commons.math3.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Solution662 {
    public int widthOfBinaryTree(TreeNode root) {

        int ans = 1;
        List<Pair<TreeNode, Integer>> list = new ArrayList<>();
        list.add(new Pair<>(root, ans));
        while (!list.isEmpty()) {

            List<Pair<TreeNode, Integer>> tmp = new ArrayList<>();
            for (Pair<TreeNode, Integer> pair: list) {
                TreeNode node = pair.getKey();
                Integer index = pair.getValue();
                if (node.left != null) {
                    tmp.add(new Pair<>(node.left, index * 2));
                }
                if (node.right != null) {
                    tmp.add(new Pair<>(node.right, index * 2 + 1));
                }
            }
            ans = Math.max(ans, list.get(list.size() - 1).getValue() - list.get(0).getValue() + 1);
            list = tmp;
        }
        return ans;
    }
}
