package leet.code.start20220510;

public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = 0, n2 = 0;
        int[] ans = new int[m + n];
        int cur;
        while (n1 < m || n2 < n) {
            if (n1 == m) {
                cur = nums2[n2++];
            } else if (n2 == n) {
                cur = nums1[n1++];
            } else if (nums1[n1] > nums2[n2]) {
                cur = nums2[n2++];
            } else {
                cur = nums1[n1++];
            }
            ans[n1 + n2 - 1] = cur;
        }
        for (int i = 0; i < n + m; i++) {
            nums1[i] = ans[i];
        }
    }
}
