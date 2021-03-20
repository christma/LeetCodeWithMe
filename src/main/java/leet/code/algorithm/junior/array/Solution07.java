package leet.code.algorithm.junior.array;

/**
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
public class Solution07 {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int len = nums.length;
        for (int j = 0; j < len; j++) {

            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        while (i < len) {
            nums[i] = 0;
            i++;
        }
    }
}
