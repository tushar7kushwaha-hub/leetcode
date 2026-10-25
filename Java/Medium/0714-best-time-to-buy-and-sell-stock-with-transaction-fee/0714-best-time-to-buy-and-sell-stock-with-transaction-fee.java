import java.util.Arrays;
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int cash = 0;
        int holding = -prices[0];
        for(int i = 1; i < prices.length; i++){
            int prvCash = cash;
            cash=Math.max(cash, holding+prices[i]-fee);
            holding = Math.max(holding, prvCash-prices[i]);
        }
        return cash;
    }
}