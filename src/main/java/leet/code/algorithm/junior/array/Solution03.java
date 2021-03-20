package leet.code.algorithm.junior.array;


public class Solution03 {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        swap(nums, 0, nums.length - 1);
        swap(nums, 0, k - 1);
        swap(nums, k, nums.length - 1);

    }

    private void swap(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }

    }


    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(3 % 7);
        new Solution03().rotate(x, 3);
        System.out.println();
    }
}
