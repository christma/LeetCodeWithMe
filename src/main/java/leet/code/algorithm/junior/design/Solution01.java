package algorithm.junior.design;

import java.util.Random;

public class Solution01 {

    private int[] nums;
    private Random random;

    public Solution01(int[] nums) {
        this.nums = nums;
        random = new Random();

    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return nums;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {

        if (nums == null) {
            return null;
        }
        int[] temp = nums.clone();
        for (int j = 0; j < temp.length; j++) {
            int i = random.nextInt(j + 1);
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

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution01 obj = new Solution01(nums);
        int[] param_1 = obj.reset();
        int[] param_2 = obj.shuffle();
        System.out.println(param_1);
        System.out.println(param_2);
    }
}
