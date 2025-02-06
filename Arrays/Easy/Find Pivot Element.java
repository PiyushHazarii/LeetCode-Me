class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        int cummulativeSum = 0; // the left sum
        for(int i=0;i<n;i++){
            int leftSum = cummulativeSum;
            int rightSum = sum - leftSum - nums[i];
            if(leftSum == rightSum){
                return i;
            }
            // we dont take an extra O(n) space rather than we
            // we can take a commulative sum that can add all the
            // element of an array and assign to the left sum 
            // just like taking an array

            // here we can find the sum of left elements further
            cummulativeSum += nums[i];
        }
        return -1;
    }
}