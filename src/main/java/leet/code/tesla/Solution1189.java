package leet.code.tesla;

import java.util.Arrays;

public class Solution1189 {
    public int maxNumberOfBalloons(String text) {

        int[] ans = new int[5];
        char[] chars = text.toCharArray();
        for (char c: chars) {
            if (c == 'b') {
                ans[0]++;
            } else if (c == 'a') {
                ans[1]++;
            } else if (c == 'l') {
                ans[2]++;
            } else if (c == 'o') {
                ans[3]++;
            } else if (c == 'n') {
                ans[4]++;
            }


        }
        ans[2] /= 2;
        ans[3] /= 2;
        return Arrays.stream(ans).min().getAsInt();
    }
}
