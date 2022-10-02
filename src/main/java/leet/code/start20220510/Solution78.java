package leet.code.start20220510;

import java.util.ArrayList;
import java.util.List;

public class Solution78 {
    List<Integer> t = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < (1 << nums.length); i++) {
            t.clear();
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    t.add(nums[j]);
                }
            }
            ans.add(new ArrayList<>(t));
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(0 & 0);
    }

}
