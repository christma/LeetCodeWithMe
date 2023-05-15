package leet.code.other;

import java.util.Arrays;
import java.util.Comparator;

public class Solution179 {
    private class LargerNumberComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1);
        }
    }

    public String largestNumber(int[] nums) {

        String[] ansString = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ansString[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(ansString, new LargerNumberComparator());

        if (ansString[0].equals("0")) {
            return "0";
        }
        String ans = new String();

        for (String s : ansString) {
            ans += s;
        }
        return ans;
    }
}
