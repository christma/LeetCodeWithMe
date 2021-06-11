package leet.code;

import java.util.Arrays;

public class Solution889 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        int n = pre.length;
        if (n == 0) {
            return null;


        }
        TreeNode root = new TreeNode(pre[0]);
        if (n == 1) {
            return root;

        }

        int L = 0;
        for (int i = 0; i < n; i++) {
            if (post[i] == pre[1]) {
                L = i + 1;
            }
        }

        root.left = constructFromPrePost(Arrays.copyOfRange(pre, 1, L + 1),
                Arrays.copyOfRange(post, 0, L));

        root.right = constructFromPrePost(Arrays.copyOfRange(pre, L + 1, n),
                Arrays.copyOfRange(post, L, n - 1));


        return root;
    }
}
