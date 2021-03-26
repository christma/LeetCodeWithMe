package algorithm.junior.dynamic;

public class Solution01 {
    public int climbStairs(int n) {

        return fbnc(n, 1, 1);
    }

    private int fbnc(int n, int a, int b) {

        if (n <= 1) {
            return b;
        }
        return fbnc(n - 1, b, a + b);
    }


    public int climbStairs1(int n) {

        if (n <= 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


}
