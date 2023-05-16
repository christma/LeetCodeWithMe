package leet.code.tesla;

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

        StringBuffer reverse = new StringBuffer(buffer).reverse();
        return reverse.toString().equals(buffer.toString());


    }
}
