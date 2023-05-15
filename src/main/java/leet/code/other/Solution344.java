package leet.code.other;

public class Solution344 {

    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (r > l) {
            swap(s, r, l);
            r--;
            l++;
        }
    }

    private void swap(char[] s, int r, int l) {
        char t = s[l];
        s[l] = s[r];
        s[r] = t;
    }
}
