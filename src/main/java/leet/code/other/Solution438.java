package leet.code.other;

import java.util.ArrayList;
import java.util.List;

public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        int[] needs = new int[26];
        int[] window = new int[26];

        for (int i = 0; i < p.length(); i++) {
            needs[p.charAt(i) - 'a']++;
        }
        int l = 0;
        int r = 0;

        while (r < s.length()) {
            int curR = s.charAt(r) - 'a';
            r++;
            window[curR]++;

            while (window[curR] > needs[curR]) {
                int curL = s.charAt(l) - 'a';
                l++;
                window[curL]--;
            }
            if (r - l == p.length()) {
                ans.add(l);
            }

        }

        return ans;

    }


    public static void main(String[] args) {
        Solution438 solution438 = new Solution438();
        System.out.println(solution438.findAnagrams("cbaebabacd", "abc"));
    }
}
