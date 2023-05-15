package leet.code.other;

import java.util.HashSet;
import java.util.Set;

public class Solution202 {

    public boolean isHappy(int n) {

        if (n == 1) {
            return true;
        }
        Set set = new HashSet();
        while (!set.contains(n)) {
            set.add(n);
            int sum = 0;
            while (n > 0) {
                int value = n % 10;
                sum += value * value;
                n /= 10;
            }
            if (sum == 1) return true;
            n = sum;
        }
        return false;

    }
}
