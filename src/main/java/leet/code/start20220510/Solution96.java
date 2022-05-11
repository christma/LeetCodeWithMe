package leet.code.start20220510;

public class Solution96 {
    public int numTrees(int n) {
        int[] ints = new int[n + 1];
        ints[0] = 1;
        ints[1] = 1;
        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                ints[i] += ints[j - 1] * ints[i - j];
            }
        }
        return ints[n];
    }
}
