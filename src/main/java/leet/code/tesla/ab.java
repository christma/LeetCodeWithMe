package leet.code.tesla;

public class ab {
    public boolean orderAB(String S){
        int length = S.length();
        for (int i = 0; i < length -1; i++) {
            if(S.charAt(i) > S.charAt(i+1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new ab().orderAB("b"));

    }

}
