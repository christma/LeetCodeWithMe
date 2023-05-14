package leet.code.interview;

public class Solution125 {
    public boolean isPalindrome(String s) {

        StringBuffer buffer = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                buffer.append(Character.toLowerCase(c));
            }
        }
//        StringBuffer reverse = new StringBuffer(buffer).reverse();
//        return buffer.toString().equals(reverse.toString());

        int n = buffer.length();
        int left = 0, right = n - 1;
        while (left < right){
            if(buffer.charAt(left) != buffer.charAt(right)){
                return false;
            }
            left ++;
            right--;
        }
        return true;
    }
}
