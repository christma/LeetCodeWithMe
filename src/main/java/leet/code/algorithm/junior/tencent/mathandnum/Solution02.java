package leet.code.algorithm.junior.tencent.mathandnum;

public class Solution02 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev == x || rev / 10 == x;
    }

    public static void main(String[] args) {
        new Solution02().isPalindrome(99999);
    }
}
