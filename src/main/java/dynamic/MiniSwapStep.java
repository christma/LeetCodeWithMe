package dynamic;

public class MiniSwapStep {

    public static int minStep(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] str = s.toCharArray();
        int step1 = 0;
        int step2 = 0;
        int gi = 0;
        int bi = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'G') {
                step1 += i - gi;
                gi++;
            } else {
                step2 += i - bi;
                bi++;
            }

        }
        return Math.min(step1, step2);
    }
}
