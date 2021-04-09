package leet.code.algorithm.junior.tencent.strings;

public class Solution12 {
    public void reverseString(char[] s) {

        int l = 0, r = s.length - 1;
        while (l < r) {
            swap(s, l, r);
            l++;
            r--;
        }
    }

    private void swap(char[] s, int l, int r) {
        char c = s[l];
        s[l] = s[r];
        s[r] = c;
    }
}
