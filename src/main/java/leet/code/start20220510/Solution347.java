package leet.code.start20220510;

import java.util.*;

public class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer key: nums) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int key = entry.getKey(), value = entry.getValue();
            if (priorityQueue.size() == k) {
                assert priorityQueue.peek() != null;
                if (priorityQueue.peek()[1] < value) {
                    priorityQueue.poll();
                    priorityQueue.offer(new int[]{key, value});
                }
            }else {
                priorityQueue.offer(new int[]{key, value});
            }
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = Objects.requireNonNull(priorityQueue.poll())[0];
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {4,1,-1,2,-1,2,3};
        int k = 2;
        int[] ints = new Solution347().topKFrequent(nums, k);
        for (int anInt: ints) {
            System.out.println(anInt);
        }
    }
}
