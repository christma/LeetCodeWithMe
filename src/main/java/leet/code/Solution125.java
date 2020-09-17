package leet.code;

public class Solution125 {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;


        while (l < r) {
            //过滤掉不是字母或数字的元素
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            //都转化成小写进行比较
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution125 solution125 = new Solution125();
        String s1 = "A man a plan a canal Panama";
        System.out.println(solution125.isPalindrome(s1));

    }
}
