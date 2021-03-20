package leet.code.algorithm.junior.string;

public class Solution02 {
    public int reverse(int x) {

        int res = 0;
        while (x != 0) {
            int t = x % 10;
            int newRes = res * 10 + t;
            if ((newRes - t) / 10 != res) {
                return 0;
            }
            res = newRes;
            x /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int temp = -321;
        System.out.println(temp);
        System.out.println(new Solution02().reverse(temp));
    }
}
