package leet.code.interview;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution0104 {

    public boolean canPermutePalindrome(String s) {

        char[] chars = s.toCharArray();
        Deque array = new ArrayDeque();
        for (char aChar: chars) {
            System.out.println(aChar);
            if (array.contains(aChar)) {
                array.remove(aChar);
            } else {
                array.add(aChar);
            }
        }
        return array.size() == 1 || array.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new Solution0104().canPermutePalindrome("tactcoa"));
    }


}
