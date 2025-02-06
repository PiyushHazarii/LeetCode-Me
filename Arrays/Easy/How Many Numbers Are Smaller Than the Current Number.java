class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int n = nums.length;
        int count[] = new int[101];
        for(int i : nums)
        {
            count[i]++;
        }
        for(int i=1;i<count.length;i++)
        {
            count[i] += count[i-1];
        }
        int result[] = new int [n];
        for(int i=0;i<n;i++)
        {
            if(nums[i] != 0)
            {
                result[i] = count[nums[i]-1];
            }
        }
        return result;
    }
}