class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> resultlist = new ArrayList<>();

        backTrack(resultlist , new ArrayList<>(),nums ,0);
        return resultlist;
        
        
    }

    public void backTrack(List<List<Integer>> resultsets, List<Integer> tempsets, int[] nums, int start)
    {
        resultsets.add(new ArrayList<>(tempsets));

        for(int i= start ; i<nums.length;i++)
        {
            // this add nums[i] to temp
            tempsets.add(nums[i]);

            // this is the recursive call to thh backtrack
            backTrack(resultsets , tempsets , nums,i+1);

            // again we remove and further started form
            tempsets.remove(tempsets.size()-1);
        }
    }
}