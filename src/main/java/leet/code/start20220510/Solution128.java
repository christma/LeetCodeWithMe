package leet.code.start20220510;

import java.util.HashSet;

public class Solution128 {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }

        int longesStreak = 0;
        for (int num: nums) {
            if (!set.contains(num - 1)) {
                int curNum = num;
                int curStreak = 1;
                while (set.contains(curNum + 1)) {
                    curNum++;
                    curStreak++;
                }
                longesStreak = Math.max(longesStreak, curStreak);
            }
        }
        return longesStreak;

    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(new Solution128().longestConsecutive(nums));
    }
}
