class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 0) return;

        int count =0;
        for(int n : nums){
            if(n != 0) 
            nums[count++] = n;
        }
        while(count < nums.length)
        nums[count++] = 0;
    }
}