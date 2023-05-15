package leet.code.other;

public class Solution50 {
    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1/quickMul(x, -N);
    }

    private double quickMul(double x, long n) {
        if (n == 0) {
            return 1.0;
        }

        double y = quickMul(x, n / 2);
        return n % 2 == 0 ? y * y : y * y * x;
    }


    public static void main(String[] args) {
        double v = new Solution50().myPow(2, 2);
        System.out.println(v);
    }

}
