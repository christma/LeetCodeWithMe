package leet.code.algorithm.junior.tencent.strings;

public class Solution09 {
    public int removeDuplicates(int[] nums) {

        int length = nums.length;
        int j = 0;
        for (int i = 1; i < length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }
}
