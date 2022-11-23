package leet.code.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);

        ArrayList<List<Integer>> ans = new ArrayList<>();
        int bast = Integer.MAX_VALUE;
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int curr = arr[i+1] - arr[i];
            if (curr < bast) {
                bast = curr;
                ans.clear();
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(arr[i]);
                arrayList.add(arr[i + 1]);
                ans.add(arrayList);

            } else if (bast == curr) {
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(arr[i]);
                arrayList.add(arr[i + 1]);
                ans.add(arrayList);
            }


        }
        return ans;
    }
}
