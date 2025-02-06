 // O(nlogn) Time Solution

 class Solution {
    public int findPairs(int[] nums, int k) {
        Set<Integer> uniquePair = new HashSet();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 1; i++)
    //    Arrays.binarySearch(array_name, start_index, end_index, 
    //    value_for_checking) ==> this method returns index of value 
    //    which we are searching.

        	if (Arrays.binarySearch(nums, i + 1, n, nums[i] + k) > 0)
        		uniquePair.add(nums[i]);

        return uniquePair.size();

        
       // Map<Integer,Integer> map = new HashMap<>();
       // for(int i=0;i<n;i++){
       //     int remaining =  nums[i] - k;
       //     if(map.containsKey(remaining)){
       //         uniquePair.add(nums[i]);
       //     }
       //     map.put(nums[i],i);
       // }
       // return uniquePair.size();
    }
}