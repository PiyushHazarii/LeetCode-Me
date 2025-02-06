class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int totalProfit =0;
        // isme hum tab hi sell karenge apna stcok jab 
        // i-1 wala chota hoga i se matlab
        // see the loop normal intuition hai 

        for(int i=1; i<n; i++){
            if(prices[i-1] < prices[i]){
                totalProfit += (prices[i] - prices[i-1]);
            }
        }
        return totalProfit;
    }
}