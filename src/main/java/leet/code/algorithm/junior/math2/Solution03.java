package leet.code.algorithm.junior.math2;

public class Solution03 {
    public boolean isPowerOfThree(int n) {
        if (n > 1) {
            while (n % 3 == 0) {
                n /= 3;
            }
        }
        return n == 1;
    }


    public static void main(String[] args) {
        System.out.println(new Solution03().isPowerOfThree(9));
        System.out.println(100 % 3);
        System.out.println(1 % 3);
    }
}
