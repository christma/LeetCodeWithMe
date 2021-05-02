package leet.code.algorithm.junior.string2;

public class Solution02 {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int t = x % 10;
            int newRes = res * 10 + t;
            if ((newRes - t) / 10 != res) {
                return 0;
            }
            res = newRes;
            x /= 10;
        }
        return res;
    }
}
