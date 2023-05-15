package leet.code.other;

import java.util.Arrays;

public class FindPrimes {
    // TODO: 2021/3/6  时间复杂度 O（n^2）
    int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrimes(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrimes(int i) {

        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }

        return true;
    }

    int countPrimes2(int n){
        boolean[] isPrimes = new boolean[n];
        Arrays.fill(isPrimes,true);

        for (int i = 2; i*i < n; i++) {
            if(isPrimes[i]){
                for (int j = i * i ; j < n; j+=i) {
                    isPrimes[j]=false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(isPrimes[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int sum  = 5;
        System.out.println(new FindPrimes().countPrimes2(sum));
        System.out.println(new FindPrimes().countPrimes(sum));
    }

}
