class Solution {
    private void getcomb(int[] nums, int index, int target,
                     List<Integer>cur, List<List<Integer>> res){

        // iska matlab ki target mil gaya hai tbahi wo 0 ke equal hua hai.
        if(target == 0){
            res.add(new ArrayList<Integer>(cur));
            return;
        }

        // yaha pr target 0 se chota le rahe hai kyuki 
        // backtracking ke time har baar target subtract krke
        // bhej rahe hai issi liye and index ko bhadha rahe hai
        if(target < 0 || index >= nums.length) 
            return;
        
        for(int i = index ; i < nums.length; i++){
            cur.add(nums[i]);
            getcomb(nums, i, target-nums[i], cur, res);
            cur.remove(cur.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        getcomb(candidates, 0, target, new ArrayList<>(), res);
        return res;
    }
}