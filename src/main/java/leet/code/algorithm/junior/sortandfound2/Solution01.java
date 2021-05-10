package leet.code.algorithm.junior.sortandfound2;

public class Solution01 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < m && j < n) {
            if (nums1[i] > nums2[j]) {
                temp[index] = nums2[j];
                j++;
                index++;
            } else {
                temp[index] = nums1[i];
                i++;
                index++;
            }
        }
        while (i < m) {
            temp[index++] = nums1[i++];
        }
        while (j < n) {
            temp[index++] = nums2[j++];
        }
        System.arraycopy(temp, 0, nums1, 0, temp.length);
    }
}
