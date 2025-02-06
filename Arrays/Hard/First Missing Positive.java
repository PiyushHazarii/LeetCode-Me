class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // this is the loop that makes all the negative number into zero
        for(int i=0;i<n;i++){
            if(nums[i] < 0){
                nums[i] = 0;
            }
        }

        // now we can visit all the element and mark them into negative
        // so that we can find the missing positive no.

        for(int i=0;i<n;i++){
            // we can take the abs value beacuse if the 
            // elment appears two or more than two times
            int val = Math.abs(nums[i]);
            if(1 <= val && val <= n){
                if(nums[val-1] > 0){
                    nums[val - 1] *= -1;
                }else if(nums[val-1] == 0){
                    // this is the special case where we have to handle this
                    nums[val -1] = -1 * (n+1);
                }
            }
        }
        for(int i=1; i<=n ;i++){
                if(nums[i-1] >= 0){
                    return i;
                }
            }
        return n+1;
    }
}