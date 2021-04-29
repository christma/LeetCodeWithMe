package leet.code.algorithm.junior.array2;

public class Solution03 {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int temp[] = new int[length];
        for (int i = 0; i < length; i++) {
            temp[i] = nums[i];
        }

        for (int i = 0; i < length; i++) {
            System.out.println(nums[(i + k) % length]);
            System.out.println(nums[i]);
            nums[(i + k) % length] = temp[i];
        }
    }


    public void rotate1(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        reverse(nums, 0, length - 1);
        reverse(nums, 0, k-1);
        reverse(nums, k, length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;

        }
    }


    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        new Solution03().rotate1(nums, 3);
    }
}
