package leet.code.start20220510;

public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int fast = 1, slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(new Solution26().removeDuplicates(nums));
    }
}
