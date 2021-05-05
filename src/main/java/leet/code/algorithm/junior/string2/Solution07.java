package leet.code.algorithm.junior.string2;

public class Solution07 {
    public int strStr(String haystack, String needle) {
        int length = needle.length();
        int total = haystack.length() - length + 1;
        for (int i = 0; i < total; ++i) {
            if (haystack.substring(i, i + length).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
