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
                    // falg ko zero krna important hai kyuki agar pehele aayega contains 
                    // then not contains aayega to wo bina zero kiye bahar aa jayega
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