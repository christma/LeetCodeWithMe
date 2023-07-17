package dynamic;

public class findDuplicate {
    public static int findDuplicateSorted(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if ((m - 1 >= 0 && arr[m - 1] == arr[m]) || (m + r < arr.length && arr[m + 1] == arr[m])) {
                ans = arr[m];
                break;
            }
            if (m - l == arr[m] - arr[l]) {
                l = m + 1;
            } else {
                r = m - 1;
            }

        }
        return ans;
    }


    public static int findDuplicateRandom(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }
        int slow = arr[0];
        int fast = arr[arr[0]];
        while (fast != slow) {
            slow = arr[slow];
            fast = arr[arr[fast]];
        }


        fast = 0;
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}
