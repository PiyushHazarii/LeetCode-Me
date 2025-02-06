//BRUTE FORCE

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n= nums.length;
        int count =0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(nums[i] == nums[j] && i<j)
                {
                    count++;
                }
            }
        }
        return count; 
    }
}


// OPTIMAL APPROACH 


class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int result = 0;

        for(int i : nums) {
            int count = map.getOrDefault(i, 0);
            result = result + count;
            map.put(i, count + 1);
        }

        return result;
    }
}