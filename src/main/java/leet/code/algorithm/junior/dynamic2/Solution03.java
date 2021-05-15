package leet.code.algorithm.junior.dynamic2;

public class Solution03 {
    public int maxSubArray(int[] nums) {

        int length = nums.length;
        int max = nums[0];
        int cur = max;
        for (int i = 1; i < length; i++) {
            cur = Math.max(cur, 0) + nums[i];
            max = Math.max(cur, max);
        }
        return max;
    }
}
