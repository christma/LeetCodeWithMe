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

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        new Solution03().rotate(nums, 3);
    }
}
