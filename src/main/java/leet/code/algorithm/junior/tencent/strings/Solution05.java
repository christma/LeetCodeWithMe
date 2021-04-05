package leet.code.algorithm.junior.tencent.strings;

public class Solution05 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String res = strs[0];
        int i = 1;

        while (i < strs.length) {
            while (strs[i].indexOf(res) != 0) {
                res = res.substring(0, res.length() - 1);
            }
            i++;
        }
        return res;
    }
}
