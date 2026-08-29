class Solution {
    public int maxProfit(int[] prices) {
    
    int left = 0;
    int right = prices.length-1;
    int profit = 0;

    while(left<right){
        int cur_profit = prices[right]-prices[left];
        if(cur_profit>profit){
            profit = cur_profit;
        }
        if(prices[left]>prices[right]){
            left++;
        }else right--;
    }
    return profit;
    }
}