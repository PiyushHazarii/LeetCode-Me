class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int n = words.length;
        HashSet<String> unique = new HashSet<>();
        String morsecode[] = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String word : words)
        {
            StringBuilder st = new StringBuilder();
            for(char ch : word.toCharArray())
            {
                st.append(morsecode[ch-'a']);
            }
            unique.add(st.toString());
        }
            return unique.size();
    }
}