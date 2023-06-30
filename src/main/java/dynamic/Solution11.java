package dynamic;

public class Solution11 {
    public int maxArea(int[] height) {

        int r = height.length - 1;
        int l = 0;
        int max = 0;
        while (r > l) {
            max = Math.max(max, Math.min(height[r], height[l]) * (r - l));
            if (height[r] > height[l]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
