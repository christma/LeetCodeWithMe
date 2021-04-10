package leet.code.algorithm.junior.tencent.strings;

import java.util.ArrayList;
import java.util.List;

public class Solution14 {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        ans[0] = 1;
        for (int i = 1; i < length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = length - 1; i >= 0; i--) {
            ans[i] *= right;
            right *= nums[i];
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] ints = new Solution14().productExceptSelf(nums);
        for (int n : ints) {
            System.out.println(n);
        }
    }
}
