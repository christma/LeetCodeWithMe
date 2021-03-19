package algorithm.junior;

public class Solution09 {
    public int[] plusOne(int[] digits) {

        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int temp[] = new int[length + 1];
        temp[0] = 1;
        return temp;
    }
}
