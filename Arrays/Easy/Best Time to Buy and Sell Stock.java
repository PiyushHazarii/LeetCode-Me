// package Arrays.Easy;

// class Solution {
//      public int maxProfit(int[] prices) {
//         int n = prices.length;
//         int left =0;
//         int right = 1;
//         int maxProfit = 0;
//         while(right < n){
//            if(prices[right] > prices[left])
//                 maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
//             else
//                 left = right;
//             right++; // ye always hoga kyuki ye bhadega nhi to kaise chalega loop
//         }
//         return maxProfit;
//     }
// }

// this is optimal solution according to dsa sir 
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i: prices){
            if(i < min)
                min = i;
            maxProfit = Math.max(maxProfit, i-min);
        }
        return maxProfit;
    }
}