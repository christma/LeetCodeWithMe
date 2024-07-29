package restart;

import java.util.PriorityQueue;

public class Solution703 {
    private PriorityQueue<Integer> pq;
    private int k;

    public Solution703(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
        for (int num : nums) {
            add(num);
        }

    }

    public int add(int val) {
        pq.add(val);
        if(pq.size() > k) pq.poll();
        return pq.peek();
    }
}
