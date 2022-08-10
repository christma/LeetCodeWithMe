package leet.code.start20220510;

import java.util.Arrays;

public class Solution164 {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if (n < 2) return 0;
        Arrays.sort(nums);
        int ans = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, nums[i] - nums[i - 1]);
        }
        return ans;
    }
}
