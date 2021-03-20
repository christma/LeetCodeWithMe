package leet.code.algorithm.junior.array;



import java.util.Arrays;
import java.util.HashSet;

public class Solution04 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate1(int[] nums) {

        HashSet<Integer> hs = new HashSet<Integer>();

        for (int num : nums) {
            if (!hs.add(num)) {
                return true;
            }
        }
        return false;
    }
}
