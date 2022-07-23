package leet.code.start20220510;

import java.util.HashMap;
import java.util.HashSet;

public class MSolution0101 {
    public boolean isUnique(String astr) {
        if (astr.length() == 0) {
            return true;
        }
        HashSet<Character> hashSet = new HashSet<>();
        for (char c: astr.toCharArray()) {
            if (!hashSet.add(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new MSolution0101().isUnique("abc"));
    }
}
