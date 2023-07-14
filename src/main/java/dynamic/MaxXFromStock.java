package dynamic;

public class MaxXFromStock {
    public static int maxX(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }
        int preBest = arr[0];
        int ans = 0;
        for (int i = 1; i < arr.length; i++) {
            ans = Math.max(ans, arr[i] - i + preBest);
            preBest = Math.max(preBest, arr[i] + i);
        }
        return ans;
    }
}
