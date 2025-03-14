class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        // same two pointer approach just return statement is different 
        // best approach for solving this question 
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1);
            }
        }
        return true;
    }
    public boolean isPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}