package leet.code.algorithm.junior.string;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Solution03 {

    public int firstUniqChar(String s) {

        int[] count = new int[26];

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            count[chars[i] - 'a']++;
        }

        for (int i = 0; i < chars.length; i++) {
            if (count[chars[i]] - 'a' == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "sfkasnfuefwbfnasp";
        System.out.println(s.indexOf("p"));
        System.out.println(s.lastIndexOf("p"));
    }


}
