package leet.code.algorithm.junior.array;


// todo
//  给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。

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


    public static void main(String[] args) {
    }
}
