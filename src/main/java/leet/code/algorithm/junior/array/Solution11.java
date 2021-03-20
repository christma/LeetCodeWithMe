package leet.code.algorithm.junior.array;

public class Solution11 {

    public void rotate(int[][] matrix) {

        int length = matrix.length;
        for (int i = 0; i < length / 2; i++) {
            for (int j = i; j < length - i - 1; j++) {

                int temp = matrix[i][j];
                int m = length - j - 1;
                int n = length - i - 1;
                matrix[i][j] = matrix[m][i];
                matrix[m][i] = matrix[n][m];
                matrix[n][m] = matrix[j][n];
                matrix[j][n] = temp;
            }
        }
    }

}
