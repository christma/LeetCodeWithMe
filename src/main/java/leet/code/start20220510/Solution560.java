package leet.code.start20220510;

public class Solution560 {
    public int subarraySum(int[] nums, int k) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] nums = {1,1,1,1};
        System.out.println(new Solution560().subarraySum(nums,2));
    }
}
