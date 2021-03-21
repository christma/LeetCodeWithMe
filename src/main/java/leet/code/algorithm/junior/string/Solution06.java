package leet.code.algorithm.junior.string;

public class Solution06 {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }

        int index = 0;
        int res = 0;
        int sign = 1;
        int lenght = s.length();

        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
        }
        for (; index < lenght; ++index) {

            int digit = s.charAt(index) - '0';
            if (digit < 0 || digit > 9) {
                break;
            }
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            } else {
                res = res * 10 + digit;
            }
        }

        return res * sign;
    }
}
