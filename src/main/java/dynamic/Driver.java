package dynamic;

public class Driver {
    public static int maxMoney(int[][] income) {
        int N = income.length;
        int M = N >> 1;
        return process(income, 0, M);
    }

    private static int process(int[][] income, int index, int rest) {
        if (index == income.length) return 0;
        if (income.length - index == rest) {
            return income[index][0] + process(income, index + 1, rest - 1);
        }
        if (rest == 0) {
            return income[index][1] + process(income, index + 1, rest);
        }
        int p1 = income[index][0] + process(income, index + 1, rest - 1);
        int p2 = income[index][1] + process(income, index + 1, rest);
        return Math.max(p1, p2);
    }

}
