class Solution {
    public int[] decompressRLElist(int[] nums) {
        int sumfreq = 0;
        for(int i=0;i<nums.length;i+=2)
        {
            sumfreq += nums[i];
        }
        int result[] = new int[sumfreq];
        int index = 0;
        for(int i=0;i<nums.length;i+=2)
        {
            int freq = nums[i];
            int val = nums[i+1];
            while(freq-- > 0)
            {
                result[index++] = val;
            }
        }
        return result;
    }
}