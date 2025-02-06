class Solution {
    public int missingNumber(int[] nums) {
        // this has the time complexity more than the required
        // Arrays.sort(nums);
        // for(int i=0; i<=nums.length; i++){
        //     if(i != nums[i])
        //     return i;
        // }
        // return 0;

        int sum = 0;
        for(int val : nums)
            sum += val;

        int n = nums.length;
        int totalSum = n*(n+1)/2;
        return totalSum - sum;
    }
}