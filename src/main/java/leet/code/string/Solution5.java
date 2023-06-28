package leet.code.string;

public class Solution5 {

    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }

        String origin = s;
        String reverse = new StringBuffer(s).reverse().toString();
        int length = s.length();
        int maxLen = 0, maxEnd = 0;
        int[][] arr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (origin.charAt(i) == reverse.charAt(j)) {
                    if (i == 0 || j == 0) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = arr[i - 1][j - 1] + 1;
                    }
                }
                if (arr[i][j] > maxLen) {
                    maxLen = arr[i][j];
                    maxEnd = i;
                }
            }

        }
        return s.substring(maxEnd - maxLen + 1, maxEnd + 1);
    }


    // 暴力解法
    public String longestPalindrome1(String s) {
        String ans = "";
        int max = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String str = s.substring(i, j);
                if (isPalindrome(str) && str.length() > max) {
                    ans = str.substring(i, j);
                    max = Math.max(max, str.length());
                }
            }
        }
        return ans;
    }

    private boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
