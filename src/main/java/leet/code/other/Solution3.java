package leet.code.other;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {

        int[] freq = new int[256];
        int l = 0, r = -1;
        int ret = 0;

        while (r + 1 < s.length()) {
            if (r + 1 < s.length() && freq[s.charAt(r + 1)] == 0) {
                freq[s.charAt(++r)]++;
            } else {
                freq[s.charAt(l++)]--;
            }
            ret = Math.max(ret, r - l + 1);
        }
        return ret;

    }

}
