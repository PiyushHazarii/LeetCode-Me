class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> res = new ArrayList<>();
         boolean[] visited = new boolean[nums.length];
         List<Integer> curr = new ArrayList<>();
         backtrack(res,nums,curr,visited);
         return res;
    }
    
     void backtrack(List<List<Integer>> res,int[] nums,List<Integer> curr, boolean[] visited){
        // when the size of the curr is equal to nums.length then only it will
        // add to the result bacuse it only want the permutaion not the 
        // all possible combination it wants all possible permutation so curr = n.
            if(curr.size()==nums.length){
             res.add(new ArrayList(curr));
                return;
            }

            for(int i=0;i<nums.length;i++){
                if(visited[i]==true)
                 continue;
                 
                curr.add(nums[i]);
                visited[i] = true;

                backtrack(res,nums, curr,visited);

                curr.remove(curr.size()-1);
                visited[i] = false;
            } 

        
    }
}