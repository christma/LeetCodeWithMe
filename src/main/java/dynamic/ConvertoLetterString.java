package dynamic;

public class ConvertoLetterString {
    public static int number(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        return process(str.toCharArray(), 0);
    }

    private static int process(char[] str, int i) {
        if (i == str.length) {
            return 1;
        }
        if (str[i] == '0') {
            return 0;
        }
        int ans = process(str, i + 1);
        if (i + 1 < str.length && (str[i] - '0') * 10 + str[i + 1] - '0' < 27) {
            ans += process(str, i + 2);
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(number("111"));
    }
}
