package leet.code.other;

public class Solution75 {

    public void sortColors(int[] nums) {

        int[] data = {0, 0, 0};
        for (int i = 0; i < nums.length; i++) {
            assert (nums[i] >= 0 && nums[i] <= 2);
            data[nums[i]]++;
        }
        int index = 0;
        for (int i = 0; i < data[0]; i++) {
            nums[index++] = 0;
        }
        for (int i = 0; i < data[1]; i++) {
            nums[index++] = 1;
        }
        for (int i = 0; i < data[2]; i++) {
            nums[index++] = 2;
        }
    }

    public void sortColors1(int[] nums) {
        int zero = -1;
        int two = nums.length;
        for (int i = 0; i < two; ) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                swap(nums, i, --two);
            } else {
                assert nums[i] == 0;
                swap(nums, ++zero, i++);
            }
        }

    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }


    public static void main(String[] args) {


    }
}
