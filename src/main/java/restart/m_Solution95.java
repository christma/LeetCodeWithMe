package restart;

import java.util.LinkedList;
import java.util.List;

public class m_Solution95 {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new LinkedList<TreeNode>();
        return generateTrees(1, n);
    }

    private List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> allTree = new LinkedList<>();
        if (start > end) {
            allTree.add(null);
            return allTree;
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> left = generateTrees(start, i - 1);
            List<TreeNode> right = generateTrees(i + 1, end);
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    allTree.add(root);
                }

            }
        }
        return allTree;
    }
}
