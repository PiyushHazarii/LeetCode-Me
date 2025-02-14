class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int countS1[] = new int[26];
        int countS2[] = new int[26];

        for(char c:s1.toCharArray()){
            countS1[c-'a']++;
        }
        int left =0;

        for(int right=0; right<s2.length(); right++){
            countS2[s2.charAt(right)-'a']++;
            if(right - left + 1 > s1.length()){
                countS2[s2.charAt(left)-'a']--;
                left++;
            }
            if(Arrays.equals(countS1,countS2)){
                return true;
            }
        }
        return false;
    }
}