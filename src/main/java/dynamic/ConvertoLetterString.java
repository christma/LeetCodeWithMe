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

    public static int dp(String s) {
        if (s == null && s.length() == 0) {
            return 0;
        }
        char[] str = s.toCharArray();
        int N = str.length;
        int[] dp = new int[N + 1];
        dp[N] = 1;
        for (int i = N - 1; i >= 0; i--) {
            if (str[i] != 0) {
                int ways = dp[i + 1];
                if (i + 1 < str.length && (str[i] - '0') * 10 + (str[i + 1] - '0') < 27) {
                    ways += dp[i + 2];
                }
                dp[i] = ways;
            }

        }
        return dp[0];
    }

    public static void main(String[] args) {
        System.out.println(number("111"));
        System.out.println(dp("111"));
    }
}
