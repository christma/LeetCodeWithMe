package leet.code.algorithm.junior.tencent.strings;

public class Solution10 {
    public int maxArea(int[] height) {

        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int ares = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, ares);
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }
}
