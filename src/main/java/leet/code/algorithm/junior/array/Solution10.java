package leet.code.algorithm.junior.array;

public class Solution10 {
    public boolean isValidSudoku(char[][] board) {


        int length = board.length;
        int line[][] = new int[length][length];
        int column[][] = new int[length][length];
        int cell[][] = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int num = board[i][j] - '0' - 1;
                int k = i / 3 * 3 + j / 3;
                if (line[i][num] != 0 || column[j][num] != 0 || cell[k][num] != 0) {
                    return false;
                }
                line[i][num] = column[j][num] = cell[k][num] = 1;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println(2 / 3 * 3 + 2 / 3);
        System.out.println('8'-'0'-1);
    }
}
