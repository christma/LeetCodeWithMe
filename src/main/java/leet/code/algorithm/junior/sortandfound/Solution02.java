package algorithm.junior.sortandfound;

public class Solution02 {
    public int firstBadVersion(int n) {

        int start = 1, end = n;
        while (start < end) {
            int mid = (start + end) / 2;
            if (!isisBadVersion(mid)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    private boolean isisBadVersion(int mid) {
        return true;
    }
}
