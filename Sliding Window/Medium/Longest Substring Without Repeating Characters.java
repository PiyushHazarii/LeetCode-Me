class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        Set<Character> set = new HashSet<>();
        int left =0;
        int count =0;

        for(int right =0; right<n; right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            // this is the window 
            count = Math.max(count, right-left+1);
        }
        return count;
    }
}