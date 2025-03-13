class Solution {
    int n;
    public List<List<String>> partition(String s) {
        n = s.length();
        List<List<String>> result = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        backTrack(result, curr, 0, s);
        return result;
    }
    public void backTrack(List<List<String>> result, List<String> curr, int index, String s){
        // when we cover all the element means we are correct all the substring are palindrome
        if(index == n){
            result.add(new ArrayList<>(curr));
            return;
        }

        // this is the basci template of backTracking 
        for(int i=index; i<n; i++){
            if(isPalindrome(s,index,i)){
                // s.substring(index, i+1)  this is for the substrign from the starting point and goes from the i+1 this is the intuition
                curr.add(s.substring(index, i+1));
                backTrack(result,curr,i+1,s);
                curr.remove(curr.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end))
            return false;

            start++;
            end--;
        }
        return true;
    }
}

