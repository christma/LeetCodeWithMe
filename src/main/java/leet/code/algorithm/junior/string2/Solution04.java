package leet.code.algorithm.junior.string2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution04 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        char[] charArray = t.toCharArray();

        for (char c : charArray) {
            if (!map.containsKey(c)) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aabbbb";
        String t = "aaaabb";
        new Solution04().isAnagram(s, t);
    }
}
