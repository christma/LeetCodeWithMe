package leet.code.interview;

import java.util.HashMap;
import java.util.Map;

public class Solution509 {
    private Map<Integer, Integer> stroeMap = new HashMap<>();

    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (null != stroeMap.get(n)) {
            return stroeMap.get(n);
        } else {
            int result = fib(n - 2) + fib(n - 1);
            return result;
        }
    }
}
