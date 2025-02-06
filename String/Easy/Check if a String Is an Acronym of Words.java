class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n = words.size();
        int count=0;
        StringBuilder sd = new StringBuilder();
        for(String word : words)
        {
            char ch = word.charAt(0);
            sd.append(ch);
        }
        if(sd.toString().equals(s))
        {
            return true;
        }
        return false;
    }
}