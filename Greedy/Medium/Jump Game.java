class Solution {
    public boolean canJump(int[] nums) {
        // this  is the greedy approach but same as array
        int n = nums.length;
        int  maxJump = 0;

        if(n==0) return true;

        for(int i=0;i<n;i++){
            if(i>maxJump)
                return false;
            maxJump = Math.max(maxJump, nums[i]+i);
        }
        return true;
    }
}