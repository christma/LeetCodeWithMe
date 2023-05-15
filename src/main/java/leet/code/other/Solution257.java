package leet.code.other;

import java.util.ArrayList;
import java.util.List;

public class Solution257 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        constructPath(root, "", paths);
        return paths;
    }

    private void constructPath(TreeNode node, String path, List<String> paths) {
        if (node != null) {
            StringBuffer sb = new StringBuffer(path);
            sb.append(Integer.toString(node.val));
            if(node.left == null && node.right == null){
                paths.add(sb.toString());
            }else {
                sb.append("->");
                constructPath(node.left,sb.toString(),paths);
                constructPath(node.right,sb.toString(),paths);
            }
        }

    }

}
