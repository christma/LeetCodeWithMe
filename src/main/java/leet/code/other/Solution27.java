package leet.code.other;

public class Solution27 {
    public int removeElement(int[] nums, int val) {

        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[ret++] = nums[i];
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution27 solution27 = new Solution27();
        int[] arr = {0, 2, 3, 1, 3, 2};
        int i = solution27.removeElement(arr, 2);
        System.out.println(i);
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}


