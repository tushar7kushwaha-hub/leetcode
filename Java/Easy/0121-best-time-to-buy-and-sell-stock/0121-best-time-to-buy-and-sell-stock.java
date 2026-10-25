class Solution {
    public int maxProfit(int[] prices) {
        int smallest = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0; i<prices.length; i++){
            smallest = Math.min(smallest, prices[i]);
            profit = Math.max(profit, prices[i]-smallest);
        }
        return profit;
    }
}