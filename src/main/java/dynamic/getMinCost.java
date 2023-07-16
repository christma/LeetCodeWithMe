package dynamic;

public class getMinCost {

    public static int minCost(int[] A, int[] B) {
        return zuo(A, B, 0, 0);
    }

    private static int zuo(int[] A, int[] B, int ai, int bi) {
        if (ai == A.length && bi == B.length) {
            return 0;
        }
        if (ai == A.length && bi != B.length) {
            return B[bi] + zuo(A, B, ai, bi + 1);
        }
        if (ai != A.length && bi == B.length) {
            return A[ai] + zuo(A, B, ai + 1, bi);
        }
        int p1 = A[ai] + zuo(A, B, ai + 1, bi);
        int p2 = B[bi] + zuo(A, B, ai, bi + 1);
        int p4 = Math.abs(A[ai] - B[bi]) + zuo(A, B, ai + 1, bi + 1);
        return Math.min(p1, Math.min(p2, p4));

    }
}
