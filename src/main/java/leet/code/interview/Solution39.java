package leet.code.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Lyon
 * @Date 2023/11/25 22:13
 * @Version 1.0
 */

public class Solution39 {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);
        helper(candidates, 0, target);
        return ans;
    }

    public void helper(int[] candidates, int start, int target) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) break;
            list.add(candidates[i]);
            helper(candidates, i, target - candidates[i]);
            list.remove(list.size() - 1);
        }

    }

}
