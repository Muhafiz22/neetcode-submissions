class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        for(int i = 0; i < prices.length - 1; i++){
            int buy = prices[i];
            for(int j = i+1; j < prices.length; j++){
                int profit = prices[j] - buy;
                if(profit > maxP){
                    maxP = profit;
                }
            }
        }
        return maxP;
    }
}
