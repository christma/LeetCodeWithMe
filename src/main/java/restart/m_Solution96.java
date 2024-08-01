package restart;

import java.util.HashMap;
import java.util.Map;

public class m_Solution96 {
    Map<Integer, Integer> map = new HashMap<>();

    public int numTrees(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int count = 0;
        for (int i = 0; i <= n; i++) {
            int left = numTrees(i - 1);
            int right = numTrees(n - i);
            count += left * right;
        }
        map.put(n, count);
        return count;
    }
}
