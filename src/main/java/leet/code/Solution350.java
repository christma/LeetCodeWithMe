package leet.code;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> record = new HashMap<>();
        for (int num : nums1) {
            if (!record.containsKey(num)) {
                record.put(num, 1);
            } else {
                record.put(num, record.get(num) + 1);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (record.containsKey(num) && record.get(num) > 0) {
                result.add(num);
                record.put(num, record.get(num) - 1);
            }
        }
        int[] ret = new int[result.size()];
        int index = 0;
        for (Integer num : result) {
            ret[index++] = num;
        }
        return ret;
    }

    private static void printArr(int[] arr) {
        for (int e : arr)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] res = (new Solution350()).intersect(nums1, nums2);
        printArr(res);
    }
}