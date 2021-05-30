package leet.code;

public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1) )== 0;
    }

    public static void main(String[] args) {
        System.out.println(3 & (3 - 1));
    }
}
