package leet.code.algorithm.junior.tencent.strings;

public class Solution04 {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        int index = 0;
        int res = 0;
        int sign = 1;
        int length = s.length();
        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }
        for (; index < length; ++index) {
            int temp = s.charAt(index) - '0';
            if (temp > 9 || temp < 0) {
                break;
            }
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && temp > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            } else {
                res = res * 10 + temp;
            }
        }
        return res * sign;
    }

    public static void main(String[] args) {
        System.out.println(new Solution04().myAtoi("-42"));
    }
}
