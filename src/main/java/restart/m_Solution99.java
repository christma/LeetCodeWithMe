package restart;

import java.util.ArrayList;
import java.util.List;

public class m_Solution99 {
    List<TreeNode> list = new ArrayList<>();

    public void recoverTree(TreeNode root) {
        inorder(root);
        TreeNode x = null;
        TreeNode y = null;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).val > list.get(i + 1).val) {
                y = list.get(i + 1);
                if (x == null) {
                    x = list.get(i);
                }
            }
        }
        if (x != null && y != null) {
            int tmp = x.val;
            x.val = y.val;
            y.val = tmp;
        }
    }

    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        list.add(root);
        inorder(root.right);

    }
}
