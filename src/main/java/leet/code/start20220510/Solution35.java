package leet.code.start20220510;

public class Solution35 {
    public int searchInsert(int[] nums, int target) {

        int n = nums.length;
        int left = 0, right = n-1, ans = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;


    }
}
