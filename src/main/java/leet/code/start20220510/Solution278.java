package leet.code.start20220510;

public class Solution278 {
    public int firstBadVersion(int n) {
        int l = 1, r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (isBadVersion(mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;

    }

    private boolean isBadVersion(int mid) {
        return false;
    }
}
