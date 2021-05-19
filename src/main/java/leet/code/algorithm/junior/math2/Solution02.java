package leet.code.algorithm.junior.math2;

public class Solution02 {
    public int countPrimes(int n) {
        boolean[] isPrimes = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrimes[i]) {
                continue;
            }
            count++;
            for (int j = i; j < n; j += i) {
                isPrimes[j] = true;
            }

        }
        return count;

    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(new Solution02().countPrimes(n));
    }
}
