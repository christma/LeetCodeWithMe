package dynamic;

public class CardsInLine {

    public static int win3(int[] arr) {
        int N = arr.length;
        int[][] fmap = new int[N][N];
        int[][] gmap = new int[N][N];
        for (int i = 0; i < N; i++) {
            fmap[i][i] = arr[i];
        }

        for (int startCol = 1; startCol < N; startCol++) {
            int L = 0;
            int R = startCol;
            while (R < N) {
                fmap[L][R] = Math.max(arr[L] + gmap[L + 1][R], arr[R] + gmap[L][R - 1]);
                gmap[L][R] = Math.min(fmap[L + 1][R], fmap[L][R - 1]);
                L++;
                R++;
            }
        }
        return Math.max(fmap[0][N - 1], gmap[0][N - 1]);

    }


    public static int win2(int[] arr) {
        int len = arr.length;
        int[][] fmap = new int[len][len];
        int[][] gmap = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                fmap[i][j] = -1;
                gmap[i][j] = -1;
            }
        }

        int f = f2(arr, 0, arr.length - 1, fmap, gmap);
        int g = g2(arr, 0, arr.length - 1, fmap, gmap);
        return Math.max(f, g);


    }

    private static int f2(int[] arr, int L, int R, int[][] fmap, int[][] gmap) {
        if (fmap[L][R] != -1) {
            return fmap[L][R];
        }
        int ans = 0;
        if (L == R) {
            ans = arr[L];
        } else {
            int f = arr[L] + g2(arr, L + 1, R, fmap, gmap);
            int g = arr[R] + g2(arr, L, R - 1, fmap, gmap);
            ans = Math.max(f, g);
        }
        fmap[L][R] = ans;
        return ans;
    }


    private static int g2(int[] arr, int L, int R, int[][] fmap, int[][] gmap) {
        if (gmap[L][R] != -1) {
            return gmap[L][R];
        }
        int ans = 0;

        if (L != R) {
            int f = f2(arr, L + 1, R, fmap, gmap);
            int g = f2(arr, L, R - 1, fmap, gmap);
            ans = Math.min(f, g);
        }
        gmap[L][R] = ans;
        return ans;
    }


    public static int win1(int[] arr) {

        int f = f(arr, 0, arr.length - 1);
        int g = g(arr, 0, arr.length - 1);
        return Math.max(f, g);
    }

    public static int f(int[] arr, int L, int R) {
        if (L == R) {
            return arr[L];
        }
        int p1 = arr[L] + g(arr, L + 1, R);
        int p2 = arr[R] + g(arr, L, R - 1);
        return Math.max(p1, p2);
    }
    public static int g(int[] arr, int L, int R) {
        if (L == R) {
            return 0;
        }
        int p1 = f(arr, L + 1, R);
        int p2 = f(arr, L, R - 1);
        return Math.min(p1, p2);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{50, 100, 20, 10};
        System.out.println(win1(arr));
        System.out.println(win2(arr));
        System.out.println(win3(arr));
    }
}
