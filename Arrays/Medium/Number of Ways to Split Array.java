class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;

        long rightsum =0;
        long leftsum =0;

        // first we can find the rightsum that is the totalsum of the array
        // then we can compare with the left sum 
        for(int i:nums){
            rightsum += i;
        }
        int count =0;

        for(int i=0; i<n-1; i++){
            leftsum += nums[i];
            rightsum -= nums[i];

            // as the question ask tha leftsum is always greater than = to the rightsum
            if(leftsum >= rightsum){
                count++;
            }
        }
        return count;
    }
}