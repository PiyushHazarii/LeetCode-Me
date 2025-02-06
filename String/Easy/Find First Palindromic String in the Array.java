class Solution {
    public String firstPalindrome(String[] words) {
        int n = words.length;
        for(int i=0;i<n;i++)
        {
            if(isPalindrome(words[i]))
            {
                return words[i];
            }
        }
        return "";
        
    }
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}