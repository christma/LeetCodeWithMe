package leet.code.start20220510;

import java.util.HashSet;

public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[]{};
        }
        HashSet<Object> set = new HashSet<>();
        HashSet<Object> ans = new HashSet<>();
        for (int i: nums1) {
            set.add(i);
        }
        for (int i: nums2) {
            if (set.contains(i)) {
                ans.add(i);
            }
        }
        return ans.stream().mapToInt(x -> (int) x).toArray();
    }
}
