package leet.code.algorithm.junior.string2;

public class Solution08 {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }
        String pre = strs[0];
        int i = 1;
        while (i < strs.length) {
            while (strs[i].indexOf(pre) != 0) {
                System.out.println(strs[i].indexOf(pre));
                pre = pre.substring(0, pre.length() - 1);
            }
            i++;
        }
        return pre;
    }

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        new Solution08().longestCommonPrefix(str);
    }
}
