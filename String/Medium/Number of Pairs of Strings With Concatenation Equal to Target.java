class Solution {
    public int numOfPairs(String[] nums, String target) {

        int n = nums.length;
        int count =0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if((nums[i]+nums[j]).equals(target))
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}