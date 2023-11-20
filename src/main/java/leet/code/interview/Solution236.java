package leet.code.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author Lyon
 * @Date 2023/11/20 23:04
 * @Version 1.0
 */

public class Solution236 {
    Map<TreeNode, TreeNode> parentMap = new HashMap<>();
    Set<TreeNode> visited = new HashSet<TreeNode>();

    public TreeNode lowstCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root);
        TreeNode node =p;
        while(node !=null){
            visited.add(node);
            node = parentMap.get(node);
        }
        TreeNode ancestor = q;
        while(!visited.contains(ancestor)){
            ancestor = parentMap.get(ancestor);
        }
        return ancestor;
    }

    private void dfs(TreeNode node) {
        TreeNode left = node.left, right = node.right;
        if (left != null) {
            parentMap.put(left, node);
            dfs(left);
        }
        if (right != null) {
            parentMap.put(right, node);
            dfs(right);
        }
    }
}


