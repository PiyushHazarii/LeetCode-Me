class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list = new ArrayList<>();
        int maxFreq[]= new int[26];

        for(String s : words2){
            int freq[] = findFreq(s);

            for(int i=0; i<26; i++){
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }

        for(String ss : words1){
            boolean me = true;
            int freq[] = findFreq(ss);
            for(int i=0; i<26; i++){
                if(freq[i] < maxFreq[i]){
                    me = false;
                    break;
                }
            }
            if(me){
                list.add(ss);
            }
        }
        return list;
    }
    public static int []findFreq(String s){
        int freq[] = new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        return freq;
    }
}