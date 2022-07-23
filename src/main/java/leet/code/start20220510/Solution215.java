package leet.code.start20220510;

import java.util.Arrays;
import java.util.HashSet;

public class Solution215 {
    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for (Integer i: nums) {
            set.add(i);
            if (set.size() == nums.length - k) {
                return i;
            }
        }
        return -1;

    }
}
