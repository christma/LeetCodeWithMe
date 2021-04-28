package leet.code.algorithm.junior.array2;

public class Solution02 {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int total = 0, index = 0, length = prices.length;
        while (index < length) {
            while (index < length - 1 && prices[index] >= prices[index + 1]) {
                index++;
            }
            int min = prices[index];
            while (index < length - 1 && prices[index] <= prices[index + 1]) {
                index++;
            }
            total += prices[index] - min;
            index++;
        }
        return total;
    }
}
