class Solution {
    public int maxProfit(int[] prices) {
    if(prices == null || prices.length<2) return 0;

    int minP = Integer.MAX_VALUE;
    int maxP = 0;
    for(int i : prices){
        if(i < minP){
            minP = i;
        }else if(i-minP > maxP){
            maxP = i - minP;
        }
    } 
    return maxP;
    }
}