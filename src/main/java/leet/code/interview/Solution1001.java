package leet.code.interview;

public class Solution1001 {
    public void merge(int[] A, int m, int[] B, int n) {
        int pa = 0, pb = 0;
        int[] sorted = new int[m + n];
        int cur;
        while (pa < m || pb < n) {
            if (pa == m) {
                cur = B[pb++];
            } else if (pb == n) {
                cur = A[pa++];
            } else if (A[pa] < B[pb]) {
                cur = A[pa++];
            } else {
                cur = B[pb++];
            }
            sorted[pa + pb - 1] = cur;
        }
        for (int i = 0; i < m + n; i++) {
            A[i] = sorted[i];
        }
    }
}
