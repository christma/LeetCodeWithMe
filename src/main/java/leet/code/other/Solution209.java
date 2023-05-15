package leet.code.other;

public class Solution209 {
    public int minSubArrayLen(int s, int[] nums) {

        if (s <= 0 || nums == null)
            throw new IllegalArgumentException("Illigal Arguments");

        int res = nums.length + 1;
        for (int l = 0; l < nums.length; l++) {
            int sum = 0;
            for (int r = l; r < nums.length; r++) {

                sum += nums[r];
                if (sum >= s) {
                    res = Math.min(res, r - l + 1);
                    break;
                }
            }
        }
        return res == nums.length + 1 ? 0 : res;
    }

    public int minSubArrayLen1(int s, int[] nums) {

        if (s <= 0 || nums == null)
            throw new IllegalArgumentException("Illigal Arguments");
        int l = 0, r = -1;
        int sum = 0;
        int ret = nums.length + 1;
        while (l < nums.length) {
            if (r + 1 < nums.length && sum < s) {
                sum += nums[++r];
            } else {
                sum -= nums[l++];
            }

            if (sum >= s) {
                ret = Math.min(ret, r - l + 1);
            }
        }
        return ret == nums.length + 1 ? 0 : ret;
    }
}
