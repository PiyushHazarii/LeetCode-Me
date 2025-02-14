// this is the brute force with O(nlogn * n) time complexity 
// sliding window approach is on sliding window folder
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char ch[] = s1.toCharArray();
        Arrays.sort(ch);

        for(int i=0; i<=s2.length()-s1.length(); i++){
            String s = s2.substring(i, i+s1.length());

            char c[] = s.toCharArray();

            Arrays.sort(c);

            if(Arrays.equals(ch,c)){
                return true;
            }
        }
        return false;
    }
}