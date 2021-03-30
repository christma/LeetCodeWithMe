package algorithm.junior.math;

public class Solution03 {
    public boolean isPowerOfThree(int n) {
        return (n > 0 && 1162261467 % n == 0);
    }
}
