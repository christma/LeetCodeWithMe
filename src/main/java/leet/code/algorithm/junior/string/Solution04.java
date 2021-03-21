package leet.code.algorithm.junior.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution04 {
    public boolean isAnagram(String s, String t) {

        char[] x = s.toCharArray();
        char[] y = t.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        return Arrays.equals(x, y);
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(new Solution04().isAnagram(s, t));
    }
}
