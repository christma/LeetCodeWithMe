package leet.code.tesla;

public class Solution1304 {
    public int[] sumZero(int n) {

        int[] ans = new int[n];
        int idx = 0;
        int tmp = 1;
        if (n % 2 != 0) {
            ans[idx++] = 0;
        }
        while (idx < n) {
            ans[idx++] = tmp;
            ans[idx++] = -tmp;
            tmp++;
        }
        return ans;
    }
}
