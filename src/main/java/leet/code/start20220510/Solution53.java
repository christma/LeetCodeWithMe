package leet.code.start20220510;


public class Solution53 {
    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int num: nums) {
            pre = Math.max(pre + num, num);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
