package restart;

import java.util.ArrayList;
import java.util.List;

public class Solution501 {
    List<Integer> ans = new ArrayList<>();
    int base, count, maxCount;

    public int[] findMode(TreeNode root) {
        dfs(root);
        return ans.stream().mapToInt(Integer::intValue).toArray();

    }

    public void dfs(TreeNode node) {
        if (node == null) return;
        dfs(node.left);
        update(node.val);
        dfs(node.right);
    }

    private void update(int val) {
        if (base == val) {
            count++;
        } else {
            base = val;
            count = 1;
        }
        if (count == maxCount) {
            ans.add(val);
        }
        if (count > maxCount) {
            maxCount = count;
            ans.clear();
            ans.add(val);
        }
    }
}

