package algorithm.junior.other;

public class Solution06 {
    public int missingNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i] ^ (i + 1);
        }
        return xor;
    }


    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(new Solution06().missingNumber(nums));
        System.out.println(3 ^ 2);
    }
}
