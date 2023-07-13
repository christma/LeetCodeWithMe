package dynamic;

public class PowXN {
    // a 的 n 次方
    public static int pow(int a, int n) {
        int ans = 1;
        int t = a;
        while (n != 0) {
            if ((n & 1) != 0) {
                ans *= t;
            }
            t *= t;
            n >>= 1;
        }
        return ans;
    }


    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1D;
        }
        int pow = Math.abs(n == Integer.MIN_VALUE ? n + 1 : n);
        double t = x;
        double ans = 1D;
        while (pow != 0) {
            if ((pow & 1) != 0) {
                ans *= t;
            }
            pow >>= 1;
            t *= t;
        }
        if (n == Integer.MIN_VALUE) {
            ans *= x;
        }
        return n < 0 ? (1D / ans) : ans;
    }
}
