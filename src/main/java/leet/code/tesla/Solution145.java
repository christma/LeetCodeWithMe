package leet.code.tesla;

import java.util.ArrayList;
import java.util.List;

public class Solution145 {

    public List<Integer> postorderTraversal(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<Integer>();
        postOrder(root, ans);

        return ans;
    }

    private void postOrder(TreeNode root, ArrayList<Integer> ans) {
        if (ans == null) {
            return;
        }
        postOrder(root.left, ans);
        postOrder(root.right, ans);
        ans.add(root.val);
    }
}
