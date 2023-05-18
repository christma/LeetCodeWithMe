package leet.code.tesla;

import java.util.Arrays;

public class Solution1304 {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int flag = 0;
        int temp = 1;
        if (n % 2 != 0) {
            ans[flag++] = 0;
        }
        while (flag < n) {
            ans[flag++] = temp;
            ans[flag++] = -temp;
            temp++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.stream(new Solution1304().sumZero(7)).iterator().next());
    }
}
