package leet.code.interview;

import java.util.HashSet;
import java.util.PriorityQueue;

public class Solution1709 {
    public int getKthMagicNumber(int k) {

        int[] factors = {3, 5, 7};
        HashSet<Long> seen = new HashSet<>();
        PriorityQueue<Long> heap = new PriorityQueue<>();
        seen.add(1L);
        heap.offer(1L);
        int magic = 0;
        for (int i = 0; i < k; i++) {
            Long curr = heap.poll();
            magic = curr.intValue();
            for (int factor: factors) {
                long next = curr * factor;
                if (seen.add(next)) {
                    heap.offer(next);
                }
            }
        }
        return magic;
    }

    public static void main(String[] args) {
        System.out.println(new Solution1709().getKthMagicNumber(5));
    }

}
