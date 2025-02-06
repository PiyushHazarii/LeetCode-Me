class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = Integer.MIN_VALUE;
        int minPrices = Integer.MAX_VALUE;

        int left[] = new int[n];
        int right[] =new int[n];

        // here in this left prefix sum for the maxProfit
        for(int i=0; i<n; i++){
            minPrices = Math.min(minPrices, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrices);
            left[i] = maxProfit;
        }

        int maxPrices = Integer.MIN_VALUE;
        maxProfit = 0;

        // here in this right prefix sum of the maxProfit
        for(int i=n-1;i>=0;i--){
            maxPrices = Math.max(maxPrices, prices[i]);
            maxProfit = Math.max(maxProfit, maxPrices-prices[i]);
            right[i] = maxProfit;
        }
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n; i++){
            max = Math.max(max, (left[i]+right[i]));
        }
        return max;
    }
}
