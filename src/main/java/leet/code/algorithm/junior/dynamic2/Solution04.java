package leet.code.algorithm.junior.dynamic2;

public class Solution04 {
    public int rob(int[] nums) {

        if (nums == null) {
            return 0;
        }
        int length = nums.length;
        int dp0 = 0;
        int dp1 = nums[0];
        for (int i = 1; i < length; i++) {
            int temp = Math.max(dp0, dp1);
            dp1 = dp0 + nums[i];
            dp0 = temp;
        }
        return Math.max(dp0, dp1);
    }
}
