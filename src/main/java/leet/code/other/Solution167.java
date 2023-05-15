package leet.code.other;

public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int j = binarySearch(numbers, i + 1, numbers.length - 1, target - numbers[i]);
            if (j != -1) {
                int[] res = {i + 1, j + 1};
                return res;
            }

        }
        throw new IllegalStateException("The input has no solution");
    }

    private int binarySearch(int[] numbers, int l, int r, int target) {

        if (l < 0 || l > numbers.length) {
            throw new IllegalArgumentException("l is out of bound");
        }

        if (r < 0 || r > numbers.length) {
            throw new IllegalArgumentException("r is out of bound");
        }
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (numbers[mid] == target) {
                return mid;
            }
            if (target > numbers[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }

    public int[] twoSum2(int[] numbers, int target) {

        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            if (numbers[l] + numbers[r] == target) {
                int[] res = {l + 1, r + 1};
                return res;
            } else if (numbers[l] + numbers[r] > target) {
                r--;
            } else {
                l++;
            }

        }
        throw new IllegalStateException("The input has no solution");
    }
}
