package leet.code.algorithm.junior.math2;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            res.add(i + "");
        }
        for (int i = 2; i < n; i += 3) {
            res.set(i, "Fizz");
        }
        for (int i = 4; i < n; i += 5) {
            res.set(i, "Buzz");
        }
        for (int i = 14; i < n; i += 15) {
            res.set(i, "FizzBuzz");
        }
        return res;
    }
}
