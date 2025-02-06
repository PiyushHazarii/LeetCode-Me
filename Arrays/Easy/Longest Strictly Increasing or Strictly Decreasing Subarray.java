class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int increment =1;
        int decrement = 1;
        int result =1;
        for(int i=0; i<n-1; i++){
            if(nums[i] < nums[i+1]){
                increment++;
                decrement=1;
            }else if(nums[i] > nums[i+1]){
                decrement++;
                increment = 1;
            }else {
                increment =1 ;
                decrement =1;
            }
            result = Math.max(result, Math.max(increment, decrement));
        }
        return result;
    }
}