package restart;

import java.util.ArrayList;
import java.util.List;

public class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        path(root, "", ans);
        return ans;
    }

    private void path(TreeNode node, String path, List<String> ans) {
        if (node != null) {
            StringBuilder sb = new StringBuilder(path);
            sb.append(node.val);
            if (node.left == null && node.right == null) {
                ans.add(sb.toString());
            } else {
                sb.append("->");
                path(node.left, sb.toString(), ans);
                path(node.right, sb.toString(), ans);
            }
        }
    }
}
