// binary search approach will be there in binary search folder
class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int negativeCount =0;
        int positiveCount =0;
        for(int i=0; i<n; i++){
            if(nums[i] > 0)
            positiveCount++;
            if(nums[i] <0)
            negativeCount++;
        }
        return Math.max(negativeCount,positiveCount);
    }
}