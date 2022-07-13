package leet.code.start20220510;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution735 {
    public int[] asteroidCollision(int[] asteroids) {

        Deque<Integer> deque = new ArrayDeque<>();
        for (int aster: asteroids) {
            boolean alive = true;
            while (aster < 0 && !deque.isEmpty() && deque.peek() > 0 && alive) {
                alive = deque.peek() < -aster;
                if (deque.peek() <= -aster) {
                    deque.pop();
                }

            }
            if (alive) {
                deque.push(aster);
            }
        }

        int size = deque.size();
        int[] ans = new int[size];
        for (int i = 0; i < size; i++) {
            ans[i] = deque.removeLast();
        }


        return ans;

    }
}
