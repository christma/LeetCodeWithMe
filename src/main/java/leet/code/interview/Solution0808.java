package leet.code.interview;

import java.util.HashSet;
import java.util.LinkedList;

public class Solution0808 {
    LinkedList<String> list = new LinkedList<>();

    public String[] permutation(String S) {
        dfs(S.toCharArray(), 0);
        return list.toArray(new String[0]);
    }

    public void dfs(char[] c, int k) {
        if (k == c.length) {
            list.add(new String(c));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = k; i < c.length; i++) {
            if (!set.contains(c[i])) {
                set.add(c[i]);
                swap(c, i, k);
                dfs(c, k + 1);
                swap(c, i, k);
            }
        }
    }

    public void swap(char[] c, int x, int y) {
        char temp = c[x];
        c[x] = c[y];
        c[y] = temp;
    }
}
