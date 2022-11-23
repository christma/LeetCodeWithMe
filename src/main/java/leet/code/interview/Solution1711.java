package leet.code.interview;

public class Solution1711 {
    public int findClosest(String[] words, String word1, String word2) {
        int len = words.length;
        int ans = len;
        int index1 = -1, index2 = -1;
        for (int i = 0; i < len; i++) {
            String word = words[i];
            if (word1.equals(word)) {
                index1 = i;
            } else if (word2.equals(word)) {
                index2 = i;
            }
            if (index1 > 0 && index2 > 0) {
                ans = Math.min(ans, Math.abs(index2 - index1));
            }
        }
        return ans;
    }

}
