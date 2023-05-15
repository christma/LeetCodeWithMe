package leet.code.other;

public class Solution567 {
    public boolean checkInclusion(String s1, String s2) {
        int n = s2.length();
        int[] dict = new int[26];
        int[] freq = new int[26];
        int size = 0;
        for (char c : s1.toCharArray()) {
            if (dict[c - 'a'] == 0) {
                size++;
            }
            dict[c - 'a']++;
        }

        int match = 0;
        int left = 0, right = 0;
        while (right < n) {
            char rc = s2.charAt(right);
            freq[rc - 'a']++;
            if (freq[rc - 'a'] == dict[rc - 'a']) {
                match++;
            }
            while (size == match) {
                if (right - left + 1 == s1.length()) {
                    return true;
                }
                char lc = s2.charAt(left);
                freq[lc - 'a']--;
                if (freq[lc - 'a'] < dict[lc - 'a']) {
                    match--;
                }
                left++;
            }
            right++;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        new Solution567().checkInclusion(s1, s2);
    }
}
