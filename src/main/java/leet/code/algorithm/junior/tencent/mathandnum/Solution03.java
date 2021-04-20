package leet.code.algorithm.junior.tencent.mathandnum;

public class Solution03 {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int i : nums) {
            single ^= i;
        }
        return single;
    }
}
