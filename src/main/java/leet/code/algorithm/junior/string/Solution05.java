package leet.code.algorithm.junior.string;

public class Solution05 {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            if (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        new Solution05().isPalindrome(s);
    }
}
