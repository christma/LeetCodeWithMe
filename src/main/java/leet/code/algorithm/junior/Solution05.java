package algorithm.junior;

import java.util.HashMap;
import java.util.HashSet;

public class Solution05 {

    public int singleNumber(int[] nums) {
        int reduce = 0;
        for (int num : nums) {
            reduce = num ^ reduce;
        }
        return reduce;
    }

    public int singleNumber1(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            } else {
                hm.put(num, 1);
            }
        }
        for (Integer key : hm.keySet()) {
            if (hm.get(key) == 1) {
                return key;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 4, 3, 2, 1,1,3,4,5,6};
        System.out.println(new Solution05().singleNumber1(nums));
        ;
    }
}
