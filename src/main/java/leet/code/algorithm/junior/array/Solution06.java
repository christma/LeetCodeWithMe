package leet.code.algorithm.junior.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution06 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new ArrayList<Integer>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }

        int index = 0;
        int[] res = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            res[index++] = list.get(k);
        }
        return res;
    }


    public int[] intersect1(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int num : nums1) {
            if (hashMap.containsKey(num)) {
                hashMap.put(num, hashMap.get(num) + 1);
            } else {
                hashMap.put(num, 1);
            }
        }

        int index = 0;
        int[] result = new int[nums1.length];
        for (int num : nums2) {
            int count = hashMap.getOrDefault(num, 0);
            if (count > 0) {
                result[index] = num;
                index++;
                count--;
                if (count > 0) {
                    hashMap.put(num, count);
                } else {
                    hashMap.remove(num);
                }

            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }
}
