package leet.code.start20220510;
//
//
//        输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        输出: 6
//        解释: 连续子数组 [4,-1,2,1] 的和最大，为 6


public class JOfferSolution42 {
    public int maxSubArray(int[] nums) {

        int ans = nums[0];
        int n = 0;
        for (int num: nums) {
            n = Math.max(n + num, num);
            ans = Math.max(ans, n);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new JOfferSolution42().maxSubArray(nums));
    }
}
