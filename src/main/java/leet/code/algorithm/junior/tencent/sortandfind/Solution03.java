package leet.code.algorithm.junior.tencent.sortandfind;

import java.util.PriorityQueue;

public class Solution03 {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.offer(num);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }
}
