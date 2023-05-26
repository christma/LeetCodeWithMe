package leet.code.tesla;

public class Solution151 {
    public String reverseWords(String s) {

        String trim = s.trim();
        String[] split = trim.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = split.length-1; i >= 0; i--) {
            if(!split[i].isEmpty()){
                sb.append(split[i]);
                if(i != 0){
                    sb.append(" ");
                }
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution151().reverseWords("blue is sky the "));
    }
}
