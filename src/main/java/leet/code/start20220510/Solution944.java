package leet.code.start20220510;

public class Solution944 {
    public int minDeletionSize(String[] strs) {
        int row = strs.length;
        int col = strs[0].length();
        int ans = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 1; j < row; j++) {
                if(strs[j-1].charAt(i) > strs[j].charAt(i)){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        String [] strs = {"rrjk","furt","guzm"};
        System.out.println(new Solution944().minDeletionSize(strs));
    }
}
