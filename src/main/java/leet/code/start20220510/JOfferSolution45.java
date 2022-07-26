package leet.code.start20220510;


// [3,30,34,5,9]
// "3033459"
public class JOfferSolution45 {
    public String minNumber(int[] nums) {
        int len = nums.length;
        String[] str = new String[nums.length];
        for (int i = 0; i < len; i++) {
            str[i] = String.valueOf(nums[i]);
        }

        quickSort(str, 0, len-1);
        StringBuffer stringBuffer = new StringBuffer();
        for (String s: str) {
            stringBuffer.append(s);
        }
        return stringBuffer.toString();
    }

    private void quickSort(String[] str, int l, int r) {
        if (l > r) return;
        int p = partition(str, l, r);
        quickSort(str, l, p - 1);
        quickSort(str, p + 1, r);

    }

    // [3,30,34,5,9]
    private int partition(String[] str, int l, int r) {
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if ((str[l] + str[i]).compareTo((str[i] + str[l])) > 0) {
                j++;
                swap(str, i, j);
            }
        }
        swap(str, l, j);
        return j;
    }
    private void swap(String[] str, int i, int j) {
        String t = str[j];
        str[j] = str[i];
        str[i] = t;
    }


    public static void main(String[] args) {
        int[] nums = {1,4,7,2,5,8,0,3,6,9};
        System.out.println(new JOfferSolution45().minNumber(nums));
    }
}
