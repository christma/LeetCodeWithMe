package leet.code.other;


import org.apache.commons.math3.util.Pair;

import java.util.LinkedList;

public class Solution279 {
    public int numSquares(int n) {

        if(n == 0)
            return 0;

        LinkedList<Pair<Integer, Integer>> queue = new LinkedList<Pair<Integer, Integer>>();
        queue.addLast(new Pair<Integer, Integer>(n, 0));

        boolean[] visited = new boolean[n+1];
        visited[n] = true;

        while(!queue.isEmpty()){
            Pair<Integer, Integer> front = queue.removeFirst();
            int num = front.getKey();
            int step = front.getValue();

            if(num == 0)
                return step;

            for(int i = 1 ; num - i*i >= 0 ; i ++){
                int a = num - i*i;
                if(!visited[a]){
                    if(a == 0) return step + 1;
                    queue.addLast(new Pair(num - i * i, step + 1));
                    visited[num - i * i] = true;
                }
            }
        }

        throw new IllegalStateException("No Solution.");
    }


    public static void main(String[] args) {

        System.out.println((new Solution279()).numSquares(12));
        System.out.println((new Solution279()).numSquares(13));
    }
}
