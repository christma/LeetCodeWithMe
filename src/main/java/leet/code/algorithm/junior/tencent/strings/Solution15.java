package leet.code.algorithm.junior.tencent.strings;

import java.util.HashMap;

public class Solution15 {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }




    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        new Solution15().containsDuplicate(nums);
        System.out.println(1 ^ 2 );
    }
}
