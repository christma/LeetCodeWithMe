package algorithm.junior.math;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {
    public List<String> fizzBuzz(int n) {

        List<String> res = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                res.add("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(Integer.toString(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println();
        List<String> strings = new Solution01().fizzBuzz(15);
        for(String ele : strings){
            System.out.println(ele);
        }
    }
}
