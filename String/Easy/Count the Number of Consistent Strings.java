class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count =0;
        Set<Character> set = new HashSet<>();
        for(char c : allowed.toCharArray()){
            set.add(c);
        }
        for(String s: words){
            int flag =0;
            for(char c: s.toCharArray()){
                if(set.contains(c)){
                    flag = 1;
                }else{
                    flag =0;
                    break;
                }
            }
            if(flag == 1){
                count++;
            }
        }
        return count;
    }
}