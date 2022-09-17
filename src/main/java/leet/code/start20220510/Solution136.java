package leet.code.start20220510;

import java.util.HashSet;

public class Solution136 {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                set.remove(num);
            }
        }
        return set.iterator().next();
    }
}
