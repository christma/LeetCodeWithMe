package leet.code.start20220510;

import java.util.Arrays;

public class Solution997 {
    public int[] sortedSquares(int[] nums) {

        int len = nums.length;
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = nums[i] * nums[i];
        }
        Arrays.sort(ans);
        return ans;

    }
}
