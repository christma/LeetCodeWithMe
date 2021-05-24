package leet.code;

import java.util.HashMap;
import java.util.Map;

public class Solution96 {
    Map<Integer, Integer> map = new HashMap<>();

    public int numTrees(int n) {
        if (n == 0) {
            return 0;
        }
        return dfs(1, n);

    }

    private int dfs(int start, int end) {
        if (map.containsKey(end - start)) {
            return map.get(end - start);
        }
        if (start > end) {
            return 1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            int left = dfs(0, start - 1);
            int right = dfs(start + 1, end);
            sum += left * right;
        }
        map.put(end - start, sum);
        return sum;
    }
}
