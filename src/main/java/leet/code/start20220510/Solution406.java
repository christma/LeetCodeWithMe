package leet.code.start20220510;

import java.util.Arrays;
import java.util.Comparator;

public class Solution406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                } else {
                    return o2[1] - o1[1];
                }
            }
        });

        int n = people.length;

        int[][] ans = new int[n][];

        for (int[] person: people) {
            int spase = person[1] + 1;
            System.out.println(spase);
            for (int i = 0; i < n; i++) {
                if (ans[i] == null) {
                    --spase;
                    if (spase == 0) {
                        ans[i] = person;
                        break;
                    }
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] ints = new Solution406().reconstructQueue(people);
        for (int[] anInt: ints) {
            for (int i: anInt) {
                System.out.println("==> "+i);
            }
        }
    }
}
