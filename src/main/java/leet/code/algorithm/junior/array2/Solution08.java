package leet.code.algorithm.junior.array2;

public class Solution08 {
    public void moveZeroes(int[] nums) {

        int i = 0;
        for (int j = i; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        while (i < nums.length) {
            nums[i++] = 0;
        }
    }
}
