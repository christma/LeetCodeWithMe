package leet.code;

public class Solution14 {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0 || strs == null) {
            return "";
        }
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }

        int l = 1;
        int r = minLen;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (isCommonPrefix(strs, mid)) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return strs[0].substring(0, (l + r) / 2);
    }

    private boolean isCommonPrefix(String[] strs, int len) {
        // 截取当前位置之前的字符串判断是否是数组中字符串的公共前缀。
        String str1 = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(str1)) {
                return false;
            }
        }
        return true;
    }
}
