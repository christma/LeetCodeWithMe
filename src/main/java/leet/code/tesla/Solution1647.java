package leet.code.tesla;

import java.util.HashSet;

public class Solution1647 {
    public int minDeletions(String s) {

        char[] c = s.toCharArray();
        int[] dics = new int[26];
        for (int i = 0; i < c.length; i++) {
            dics[c[i] - 'a']++;

        }

        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < dics.length; i++) {
            int cur = dics[i];
            while (cur != 0 && !set.add(cur)) {
                cur--;
                ans++;
            }
        }
        return ans;
    }
}
