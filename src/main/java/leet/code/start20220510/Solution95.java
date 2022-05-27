package leet.code.start20220510;

import java.util.LinkedList;
import java.util.List;

public class Solution95 {
    public List<TreeNode> generateTrees(int n) {

        if (n == 0) {
            return new LinkedList<TreeNode>();
        }

        return generateTrees(1, n);
    }

    private List<TreeNode> generateTrees(int start, int end) {

        LinkedList<TreeNode> ans = new LinkedList<>();
        if (start > end) {
            ans.add(null);
            return ans;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> leftNode = generateTrees(start, i - 1);
            List<TreeNode> rightNode = generateTrees(i + 1, end);
            for (TreeNode left: leftNode) {
                for (TreeNode right: rightNode) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    ans.add(root);
                }
            }
        }
        return ans;
    }
}
