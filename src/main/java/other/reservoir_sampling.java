package other;

import java.util.Random;

/**
 * 水塘采样
 */
public class reservoir_sampling {
    public static void main(String[] args) {
        int[] S = new int[10000];
        int N = S.length;
        Random random = new Random();
        for (int r = 0; r < N; r++) {
            S[r] = random.nextInt(10000);
        }

        // 取出样本数
        int k = 10;
        int R[] = new int[k];
        for (int f = 0; f < k; f++) {
            R[f] = S[f];
        }
        int j;
        for (int i = k; i < S.length; i++) {
            j = random.nextInt(i);
            if (j < k) {
                R[j] = S[j];
            }
        }

        for (int i = 0; i < R.length; i++) {
            System.out.println(R[i]);
        }

    }
}
