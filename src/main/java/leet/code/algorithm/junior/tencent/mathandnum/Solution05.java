package leet.code.algorithm.junior.tencent.mathandnum;

public class Solution05 {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        long x = (long) n;
        return (x & (x - 1)) == 0;
    }
}
