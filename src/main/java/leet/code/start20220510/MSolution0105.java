package leet.code.start20220510;

public class MSolution0105 {
    public boolean oneEditAway(String first, String second) {

        int f = first.length();
        int s = second.length();
        if (Math.abs(f - s) > 1) {
            return false;
        }

        boolean used = false;
        for (int i = 0, j = 0; i < f && j < s; ) {

            if (first.charAt(i) == second.charAt(j)) {
                i++;
                j++;
            } else if (used) {
                return false;
            } else {
                if (f > s) {
                    i++;
                } else if (s > f) {
                    j++;
                } else {
                    i++;
                    j++;
                }
                used = true;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String first = "pales";
        String second = "pale";

        System.out.println(new MSolution0105().oneEditAway(first, second));
    }
}
