package leet.code.start20220510;


import java.sql.SQLOutput;

public class Solution179 {
    public String largestNumber(int[] nums) {

        int length = nums.length;
        String[] str = new String[length];
        for (int i = 0; i < length; i++) {
            str[i] = String.valueOf(nums[i]);
        }

        quickSort(str, 0, length - 1);
        StringBuilder sb = new StringBuilder();
        for (String s: str) {
            sb.append(s);
        }
        int len = sb.length();
        int k = 0;
        while (k < len - 1 && sb.charAt(k) == '0') k++;
        return sb.substring(k);
    }

    private void quickSort(String[] str, int l, int r) {
        if (l >= r) return;

        int p = partition(str, l, r);
        quickSort(str, l, p - 1);
        quickSort(str, p + 1, r);
    }

    private int partition(String[] str, int l, int r) {
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if ((str[l] + str[i]).compareTo((str[i] + str[l])) < 0) {
                j++;
                swap(str, i, j);
            }
        }

        swap(str, l, j);

        return j;
    }

    private void swap(String[] str, int i, int l) {
        String t = str[l];
        str[l] = str[i];
        str[i] = t;
    }


    public static void main(String[] args) {
        int[] nums = {0, 0};
        System.out.println(new Solution179().largestNumber(nums));
    }
}
