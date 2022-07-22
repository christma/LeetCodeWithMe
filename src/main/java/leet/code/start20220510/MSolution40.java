package leet.code.start20220510;

import java.util.Arrays;

public class MSolution40 {
    public int[] getLeastNumbers(int[] arr, int k) {

        int[] ans = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }
}
