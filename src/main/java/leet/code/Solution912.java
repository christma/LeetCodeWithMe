package leet.code;

public class Solution912 {

    int[] temp;
    public int[] sortArray(int[] nums) {
        temp = new int[nums.length];
        sortArray(nums, 0, nums.length - 1);
        return nums;
    }
    private void sortArray(int[] nums, int l, int r) {

        if (l >= r) {
            return;
        }

        int mid = (l + r) >> 1;
        sortArray(nums, l, mid);
        sortArray(nums, mid + 1, r);

        int i = l, j = mid + 1;
        int cnt = 0;
        while (i <= mid && j <= r) {
            if (nums[i] <= nums[j]) {
                temp[cnt++] = nums[i++];
            } else {
                temp[cnt++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[cnt++] = nums[i++];
        }
        while (j <= r) {
            temp[cnt++] = nums[j++];
        }
        for (int k = 0; k < r - l + 1; k++) {
            nums[k + l] = temp[k];
        }

    }

    public static void main(String[] args) {
        int[] nums = {-2,3,-5};
        int[] ints = new Solution912().sortArray(nums);
        for (int i : ints) {
            System.out.println(i);
        }
    }
}
