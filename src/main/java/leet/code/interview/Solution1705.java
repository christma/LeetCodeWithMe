package leet.code.interview;

import java.util.Arrays;
import java.util.HashMap;

public class Solution1705 {
    public String[] findLongestSubarray(String[] array) {
        HashMap<Integer, Integer> indices = new HashMap<>();
        indices.put(0, -1);
        int sum = 0;
        int maxLength = 0;
        int startIndex = -1;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (Character.isLetter(array[i].charAt(0))) {
                sum++;
            } else {
                sum--;
            }
            if (indices.containsKey(sum)) {
                int firstIndex = indices.get(sum);
                if (i - firstIndex > maxLength) {
                    maxLength = i - firstIndex;
                    startIndex = firstIndex + 1;
                }
            } else {
                indices.put(sum, i);
            }
        }
        if (maxLength == 0) {
            return new String[0];
        }
        String[] ans = new String[maxLength];
        System.arraycopy(array, startIndex, ans, 0, maxLength);

        return ans;
    }

    public static void main(String[] args) {
        String[] str = {"A", "1", "B", "C", "D", "2", "3", "4", "E", "5", "F", "G", "6", "7", "H", "I", "J", "K", "L", "M"};

        String[] subarray = new Solution1705().findLongestSubarray(str);

        Arrays.stream(subarray).forEach(System.out::print);
    }
}
