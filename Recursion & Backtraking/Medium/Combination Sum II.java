class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList();
        Arrays.sort(candidates);
        back(result,curr,0,candidates,target);
        return result;
    }
    public void back(List<List<Integer>> result, List<Integer> curr, int index, int candidates[], int target){
        if(target < 0) return;
        if(target == 0){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i > index && candidates[i] == candidates[i-1]) continue;
            curr.add(candidates[i]);
            back(result,curr,i+1,candidates,target-candidates[i]);
            curr.remove(curr.size()-1);
        }
    }
}