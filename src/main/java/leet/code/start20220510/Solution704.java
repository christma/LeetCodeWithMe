package leet.code.start20220510;

public class Solution704 {
    public int search(int[] nums, int target) {

        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            int t = nums[mid];
            if (t == target) {
                return mid;
            } else if (t > target) {
                l = mid - 1;
            } else {
                r = mid + 1;
            }
        }
        return -1;
    }
}
