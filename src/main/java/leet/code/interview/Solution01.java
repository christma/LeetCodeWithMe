package leet.code.interview;

import java.util.HashMap;
import java.util.Map;

public class Solution01 {

    private Map<Integer, Integer> storeNums = new HashMap<>();

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (storeNums.containsKey(target - nums[i])) {
                return new int[]{storeNums.get(target - nums[i]),i};
            } else {
                storeNums.put(nums[i],i);
            }

        }

        return new int[0];

    }
}
