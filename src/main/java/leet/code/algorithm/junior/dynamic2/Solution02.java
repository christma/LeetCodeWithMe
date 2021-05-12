package leet.code.algorithm.junior.dynamic2;

public class Solution02 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int maxPro = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            maxPro = Math.max(prices[i] - min, maxPro);
        }
        return maxPro;
    }

    public int maxProfit1(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int noHold = 0;
        int hold = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            noHold = Math.max(noHold, hold + prices[i]);
            hold = Math.max(hold, -prices[i]);
        }
        return noHold;
    }
}