package leet.code;

import java.util.HashMap;
import java.util.Map;

public class Solution290 {
    public boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" ");
        if (s.length != pattern.length()) return false;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (map.containsValue(s[i])) {
                    return false;
                }
                map.put(pattern.charAt(i), s[i]);
            } else {
                if (!map.get(pattern.charAt(i)).equals(s[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
