package leet.code.start20220510;

import java.util.Random;

public class Solution75 {
    public void sortColors(int[] nums) {
        int lt = 0;
        int gt = nums.length;
        for (int i = 0; i < gt;) {
            if (nums[i] == 0){
                swap(nums, i++, lt++);
            }else if (nums[i] == 1){
                i++;
            }else{
                swap(nums, i, --gt);
            }
        }
    }

    public void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
