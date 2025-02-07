class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int leftSum = 0;
        int rightSum =0;
        int maxSum = 0;

        // intuition :- sara left wala le lena hai elements then
        for(int i=0; i<k; i++){
            leftSum += cardPoints[i];
        }

        // maxsum ko leftsum ke equal kr dena hai 
        maxSum = leftSum;
        int rightIndex = n-1;

        // uske baad ye k-1 eas liye shuru ho raha hai kyuki
        // hum leftsum se ek ghatayenge and rightsum mein ek 
        // jodenge right side se to uske liye k-1 se shuru ho rha
        // hai and hum ek rightIndex le rahe hai jo right side se 
        // shuru hoga and decrement hoga jaise jaise loop chalega
        
        for(int i=k-1;i>=0;i--){
            leftSum = leftSum - cardPoints[i];
            rightSum += cardPoints[rightIndex];
            rightIndex--;
            maxSum = Math.max(maxSum, (leftSum+rightSum));
        }
        return maxSum;
    }
}