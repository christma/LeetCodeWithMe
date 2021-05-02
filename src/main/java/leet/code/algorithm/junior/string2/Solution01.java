package leet.code.algorithm.junior.string2;

public class Solution01 {
    public void reverseString(char[] s) {

        int l = 0;
        int r = s.length - 1;
        while (l <= r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            r--;
            l++;
        }
    }
}
