package algorithm.junior.math;

public class Solution02 {
    public int countPrimes(int n) {

        if (n < 3) {
            return 0;
        }
        int count = 1;
        for (int i = 3; i < n; i += 2) {
            count += isParimes(i) ? 1 : 0;
        }
        return count;
    }

    private boolean isParimes(int i) {
        int sqrt = (int) Math.sqrt(i);
        for (int j = 3; j <= sqrt; j += 2) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println((int)Math.sqrt(i));
        }
    }
}
