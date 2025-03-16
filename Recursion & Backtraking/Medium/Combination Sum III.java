class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
   List<List<Integer>> result = new ArrayList<>();
   List<Integer> curr = new ArrayList<>();
   back(result, curr, k, 1, n);
   return result;
}

   private void back(List<List<Integer>> result, List<Integer> curr, int k,  int index, int n) {
       if (curr.size() == k && n == 0) {
           result.add(new ArrayList<Integer>(curr));
           return;
       }
           
       for (int i = index; i <= 9; i++) {
           curr.add(i);
           back(result, curr, k, i+1, n-i);
           curr.remove(curr.size() - 1);
       }
   }
}