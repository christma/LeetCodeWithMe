package dynamic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class FindPosition {
    public static int[] find(int n, int[] a, int[] b, int[] c, int ad, int bd, int cd) {
        int[] x1 = null;
        int[] x2 = null;
        int[] x3 = null;
        int r1 = Integer.MAX_VALUE;
        int r2 = 0;
        int r3 = 0;

        if (ad < r1) {
            x1 = a;
            r1 = ad;
            x2 = b;
            r2 = bd;
            x3 = c;
            r3 = cd;
        }
        if (bd < r1) {
            x1 = b;
            r1 = bd;
            x2 = a;
            r2 = ad;
            x3 = c;
            r3 = cd;
        }
        if (cd < r1) {
            x1 = c;
            r1 = cd;
            x2 = a;
            r2 = ad;
            x3 = b;
            r3 = bd;
        }

        int[] cur = {x1[0] - r1, x1[1]};
        Queue<int[]> queue = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();
        ArrayList<int[]> ans = new ArrayList<>();
        queue.add(cur);
        visited.add(x1[0] + "_" + x1[1]);
        while (!queue.isEmpty()) {
            cur = queue.poll();
            if (cur[0] >= 1 && cur[0] <= n && cur[1] >= 1 && cur[1] <= n
                    && distance(cur[0], cur[1], x2) == r2
                    && distance(cur[0], cur[1], x3) == r3) {
                ans.add(cur);
            }
            if (ans.size() == 2) {
                break;
            }
            add(cur[0], cur[1] + 1, x1, r1, queue, visited);
            add(cur[0] - 1, cur[1] + 1, x1, r1, queue, visited);
            add(cur[0] - 1, cur[1], x1, r1, queue, visited);
            add(cur[0] - 1, cur[1] - 1, x1, r1, queue, visited);
            add(cur[0], cur[1] - 1, x1, r1, queue, visited);
            add(cur[0] + 1, cur[1] - 1, x1, r1, queue, visited);
            add(cur[0] + 1, cur[1], x1, r1, queue, visited);
            add(cur[0] + 1, cur[1] + 1, x1, r1, queue, visited);

        }
        if (ans.size() == 1 || ans.get(0)[0] < ans.get(1)[0]
                || (ans.get(0)[0] == ans.get(1)[0] && ans.get(0)[1] < ans.get(1)[1])) {
            return ans.get(0);
        } else {
            return ans.get(1);
        }


    }

    private static void add(int x, int y, int[] c, int r, Queue<int[]> queue, HashSet<String> visited) {
        String key = x + "_" + y;
        if (distance(x, y, c) == r && !visited.contains(key)) {
            queue.add(new int[]{x, y});
            visited.add(key);
        }
    }

    private static int distance(int x, int y, int[] c) {
        return Math.abs(x - c[0]) + Math.abs(y - c[1]);
    }
}
