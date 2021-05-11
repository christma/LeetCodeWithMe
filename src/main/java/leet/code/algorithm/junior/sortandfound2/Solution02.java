package leet.code.algorithm.junior.sortandfound2;

public class Solution02 {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (!isBadVersion(mid)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    private boolean isBadVersion(int mid) {
        return false;
    }
}
