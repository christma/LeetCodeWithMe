package leet.code.start20220510;

public class Solution11 {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int ans = Integer.MIN_VALUE;
        while (l < r) {
            ans = Math.max(Math.min(height[l], height[r]) * (r - l), ans);
            if (height[l] > height[r]) {
                r--;
            } else {
                l++;
            }
        }
        return ans;
    }
}
