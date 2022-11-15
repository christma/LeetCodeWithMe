package leet.code.interview;

import java.util.Arrays;

public class Solution0102 {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        return Arrays.equals(s1Array, s2Array);
    }


    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bca";
        System.out.println(new Solution0102().CheckPermutation(s1, s2));
    }
}
