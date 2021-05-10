package leet.code.algorithm.junior.sortandfound;

public class Solution01 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = new int[m + n];
        int index = 0;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                temp[index] = nums1[i];
                i++;
                index++;
            } else {
                temp[index] = nums2[j];
                index++;
                j++;
            }
        }
        while (i < m) {
            temp[index] = nums1[i];
            i++;
            index++;
        }
        while (j < n) {
            temp[index] = nums2[j];
            index++;
            j++;

        }
        System.arraycopy(temp, 0, nums1, 0, temp.length);
    }
}
