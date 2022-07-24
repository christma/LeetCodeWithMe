package leet.code.start20220510;

import org.apache.hadoop.util.QuickSort;

public class Solution912 {
    public int[] sortArray(int[] nums) {
        int len = nums.length;
        QuickSort(nums, 0, len - 1);
        return nums;
    }

    private void QuickSort(int[] nums, int l, int r) {
        if (l >= r)
            return;
        int p = partition(nums, l, r);
        QuickSort(nums, l, p - 1);
        QuickSort(nums, p + 1, r);
    }

    private int partition(int[] nums, int l, int r) {

        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (nums[i] < nums[l]) {
                j++;
                swap(nums, i, j);
            }
        }
        swap(nums, l, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[j];
        nums[j] = nums[i];
        nums[i] = t;
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1, 6, 4};
        int[] ints = new Solution912().sortArray(nums);
        for (int i: ints) {
            System.out.println(" " + i);
        }
    }
}
