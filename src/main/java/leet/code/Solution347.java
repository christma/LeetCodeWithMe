package leet.code;

import java.util.*;

public class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> freq = new HashMap();
        for (int n: nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        Queue<Integer> queue = new PriorityQueue<>((n1, n2) -> freq.get(n1) - freq.get(n2));


        for (int n : freq.keySet()) {
            queue.add(n);
            if (queue.size() > k) {
                queue.poll();
            }
        }
       List<Integer> list = new LinkedList<>();
        while (!queue.isEmpty()){
            list.add(queue.poll());
        }
        Collections.reverse(list);
        int[] ans = list.stream().mapToInt(Integer::valueOf).toArray();
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int []ans = new Solution347().topKFrequent(nums, 2);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
