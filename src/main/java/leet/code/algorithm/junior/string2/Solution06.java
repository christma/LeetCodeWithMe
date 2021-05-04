package leet.code.algorithm.junior.string2;

public class Solution06 {
    public int myAtoi(String s) {
        String str = s.trim();
        if(str.length() == 0){
            return 0;
        }
        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        int index = 0;
        int res = 0;
        int sign = 1;
        if (str.charAt(index) == '-' || str.charAt(index) == '+') {
            sign = str.charAt(index) == '-' ? -1 : 1;
            index++;
        }
        for (; index < str.length(); ++index) {

            int digit = str.charAt(index) - '0';
            if (digit < 0 || digit > 9) {
                break;
            }
            if (res > intMax / 10 || (res == intMax / 10 && digit > intMax % 10)) {
                return sign == 1 ? intMax : intMin;
            } else {
                res = res * 10 + digit;
            }

        }
        return res * sign;

    }
}
