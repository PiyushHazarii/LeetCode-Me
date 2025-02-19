class Solution {
    public int maxVowels(String s, int k) {
        int left =0;
        int right =0;
        int count =0;
        int max=0;

        while(right < s.length()){
            if(isVowel(s.charAt(right))){
                count++;
            }
            if(right-left+1 == k){
                max = Math.max(max, count);

                if(isVowel(s.charAt(left)))
                    count--;
                left++;
            }
            right++;
        }
        return max;
    }
    public static boolean isVowel(char s){
        if(s == 'a' || s == 'e'|| s == 'i' || s== 'o' || s== 'u')
            return true;
        return false;
    }
}