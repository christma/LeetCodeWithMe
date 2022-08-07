package leet.code.start20220510;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Solution720 {
    public String longestWord(String[] words) {

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                }
                return o2.compareTo(o1);
            }
        });


        String longest = "";
        HashSet<String> set = new HashSet<>();
        set.add(longest);
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (set.contains(word.substring(0, word.length() - 1))) {
                set.add(word);
                longest = word;
            }
        }
        return longest;
    }
}