package leet.code.interview;

public class Solution0106 {
    public String compressString(String S) {
        if (S.length() == 0) {
            return S;
        }
        StringBuffer ans = new StringBuffer();
        int cnt = 1;
        char c = S.charAt(0);
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == c) {
                cnt++;
            } else {
                ans.append(c);
                ans.append(cnt);
                c = S.charAt(i);
                cnt = 1;
            }
        }
        ans.append(c);
        ans.append(cnt);
        return ans.length() >= S.length() ? S : ans.toString();
    }
}
