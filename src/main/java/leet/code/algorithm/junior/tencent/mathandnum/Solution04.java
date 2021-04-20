package leet.code.algorithm.junior.tencent.mathandnum;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution04 {
    public int majorityElement(int[] nums) {
        int many = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > many) {
                return entry.getKey();
            }
        }

        return 0;
    }
}
