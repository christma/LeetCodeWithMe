package dynamic;

public class Knapstack {
    public static int maxValue(int[] w, int[] v, int bag) {
        return process(w, v, 0, bag);
    }

    private static int process(int[] w, int[] v, int index, int bag) {
        if (bag < 0) {
            return -1;
        }
        if (index == w.length) {
            return 0;
        }

        int p1 = process(w, v, index + 1, bag);
        int p2 = 0;
        int next = process(w, v, index + 1, bag - w[index]);
        if (next != -1) {
            p2 = v[index] + next;
        }
        return Math.max(p1, p2);
    }

    public static void main(String[] args) {
        int[] w = {3, 2, 4, 7, 3, 1, 7};
        int[] v = {5, 6, 3, 19, 12, 4, 2};
        int bag = 15;
        System.out.println(maxValue(w, v, bag));
    }
}
