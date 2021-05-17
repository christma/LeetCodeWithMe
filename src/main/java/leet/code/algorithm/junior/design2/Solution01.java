package leet.code.algorithm.junior.design2;

import java.util.Random;

public class Solution01 {

    private int[] nums;
    private Random random;

    public Solution01(int[] nums) {
        this.nums = nums;
        random = new Random();
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {

        if (nums == null) {
            return null;
        }
        int[] temp = nums.clone();
        for (int i = 0; i < temp.length; i++) {
            int j = random.nextInt(i + 1);
            swap(temp, i, j);
        }

        return temp;
    }

    private void swap(int[] temp, int i, int j) {
        if (i != j) {
            temp[i] = temp[i] + temp[j];
            temp[j] = temp[i] - temp[j];
            temp[i] = temp[i] - temp[j];
        }
    }

}
