package leet.code.tesla;

public class Solution9 {
    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int ans = 0;
        while (x > ans) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return x == ans || x == ans / 10;
    }


    public static void main(String[] args) {
        System.out.println(new Solution9().isPalindrome(1111));
    }
}
