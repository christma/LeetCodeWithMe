package leet.code.start20220510;

import java.util.Arrays;

public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {

        int length = nums.length;
        Arrays.sort(nums);
        int best = Integer.MAX_VALUE;

        for (int i = 0; i < length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1, k = length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    return sum;
                }

                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }
                if (sum > target) {
                    int k0 = k - 1;
                    while (j < k0 && nums[k0] == nums[k0 + 1]) {
                        k0--;
                    }
                    k = k0;
                } else {
                    int j0 = j + 1;
                    while (j0 < k && nums[j0] == nums[j0 - 1]) {
                        j0++;
                    }
                    j = j0;
                }

            }
        }
        return best;

    }
}
