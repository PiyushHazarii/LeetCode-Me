class Solution {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i+=2)
        {
            int temp;
            if(nums[i] <  nums[i+1])
            {
                temp = nums[i];
                nums[i]= nums[i+1];
                nums[i+1] = temp;
            }
        }
        return nums;
    }
}