package leet.code.tree;

public class Solution96 {
    public int numTrees(int n) {

        long C = 1;

        for (int i = 0; i < n; i++) {
            C = C * 2 * (2L * i + 1) / (i + 2);
        }

        return (int) C;
    }
}
