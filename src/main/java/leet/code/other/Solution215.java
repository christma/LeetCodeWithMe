package leet.code.other;

import java.util.*;

public class Solution215 {

    public int findKthLargest(int[] nums, int k) {


        PriorityQueue<Integer> heap = new PriorityQueue(k);
        for (int num : nums) {
            if (heap.size() < k || num > heap.peek()) {
                heap.offer(num);
            }
            if (heap.size() > k) {
                heap.poll();
            }
        }
        return heap.peek();

    }

    public static void main(String[] args) {
        Solution215 solution215 = new Solution215();
        int[] arr = {1, 1, 1, 5, 2, 2};
        int k = 3;

        System.out.println(solution215.findKthLargest(arr, k));

    }
}
