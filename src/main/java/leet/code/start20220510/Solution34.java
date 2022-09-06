package leet.code.start20220510;

public class Solution34 {
    public int[] searchRange(int[] nums, int target) {

        int len = nums.length;
        if (len == 0) {
            return new int[]{-1, -1};
        }
        int firstPosition = findFirstPosition(nums, target);
        if (firstPosition == -1) {
            return new int[]{-1, -1};
        }

        int lastPosition = findLastPosition(nums, target);
        return new int[]{firstPosition, lastPosition};
    }

    private int findLastPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right + 1) >>> 1;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                left = mid;
            } else {
                // num[mid] > target
                right = mid - 1;
            }
        }

        return left;

    }

    private int findFirstPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                right = mid;
            } else {
                // num[mid] > target
                right = mid - 1;
            }
        }
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }
}
