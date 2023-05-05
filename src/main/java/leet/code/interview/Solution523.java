package leet.code.interview;

import java.util.HashMap;

public class Solution523 {


    public boolean checkSubarraySum(int[] nums, int k) {
        int m = nums.length;
        if (m < 2) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int remander = 0;
        for (int i = 0; i < m; i++) {
            remander = (remander + nums[i]) % k;
            if (map.containsKey(remander)) {
                Integer preIndex = map.get(remander);
                if (i - preIndex >= 2) {
                    return true;
                }
            } else {
                map.put(remander, i);
            }
        }
        return false;

    }


    public static void main(String[] args) {


    }
}
