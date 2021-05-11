package leet.code.algorithm.junior.dynamic2;

public class Solution01 {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n < 3) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public int climbStairs1(int n) {
        return F(n, 1, 1);
    }

    private int F(int n, int a, int b) {
        if (n <= 1) {
            return b;
        }
        return F(n - 1, b, a + b);
    }


}
