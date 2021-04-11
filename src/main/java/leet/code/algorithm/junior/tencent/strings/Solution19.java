package leet.code.algorithm.junior.tencent.strings;

public class Solution19 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] ans = new int[m + n];
        int n1 = 0, n2 = 0;
        int cur;
        while (n1 < m || n2 < n) {
            if (n1 == m) {
                cur = nums2[n2];
                n2++;
            } else if (n2 == n) {
                cur = nums1[n1];
                n1++;
            } else if (nums1[n1] < nums2[n2]) {
                cur = nums1[n1];
                n1++;
            } else {
                cur = nums2[n2];
                n2++;
            }
            ans[n1 + n2 - 1] = cur;
        }

        for (int i = 0; i < ans.length; i++) {
            nums1[i] = ans[i];
        }

    }
}
