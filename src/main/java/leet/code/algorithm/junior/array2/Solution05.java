package leet.code.algorithm.junior.array2;

public class Solution05 {
    public int singleNumber(int[] nums) {

        int o = 0;
        for (int num : nums) {
            o = num ^ o;
        }
        return o;
    }
}
