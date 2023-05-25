package leet.code.tesla;

import java.util.Arrays;

public class Solution976 {
    public int largestPerimeter(int[] nums) {
        if (nums == null || nums.length < 3) return 0;
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 1] + nums[i - 2] > nums[i]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0;
    }
}
