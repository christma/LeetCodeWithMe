package leet.code.tesla;

import java.util.*;

public class Solution692 {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<>();
        for (String word: words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> ans = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey());
            ans.add(entry.getKey());
        }

        Collections.sort(ans, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o1) == map.get(o2) ? o1.compareTo(o2) : map.get(o2) - map.get(o1);
            }
        });

        return ans.subList(0, k);
    }

    public static void main(String[] args) {
        String [] s = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        System.out.println(new Solution692().topKFrequent(s, k));
    }
}
