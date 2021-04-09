package leet.code.algorithm.junior.tencent.strings;


public class Solution13 {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int length = s.length();
        int start = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] == ' ') {
                swap(chars, start, i - 1);
                start = i + 1;
                continue;
            }
            if (i == length - 1) {
                swap(chars, start, i);
            }
        }
        return  new String(chars);
    }

    private void swap(char[] chars, int start, int end) {
        while (start < end) {
            char c = chars[start];
            chars[start] = chars[end];
            chars[end] = c;
            start++;
            end--;
        }
    }


}
