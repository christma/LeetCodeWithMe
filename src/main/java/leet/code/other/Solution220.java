package leet.code.other;

import java.util.TreeSet;

public class Solution220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        TreeSet<Long> record = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (record.ceiling((long) nums[i] - (long) t) != null &&
                    record.ceiling((long) nums[i] - (long) t) <= (long) nums[i] + (long) t)
                return true;

            record.add((long) nums[i]);

            if (record.size() == k + 1)
                record.remove((long) nums[i - k]);
        }
        return false;
    }
}
