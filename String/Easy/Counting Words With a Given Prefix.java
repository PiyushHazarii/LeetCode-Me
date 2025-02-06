class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}


class Solution {
    public int prefixCount(String[] words, String pref) {
        int n = pref.length();
        int count = 0;
        for(int i = 0; i < words.length; i++){
        String s = words[i];
        if(s.length() >= n){
        String result = s.substring(0,n);
        if(result.equals(pref)){
            count++;
        }
        }
        }
        return count;
    }
}