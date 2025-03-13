import java.util.* ;
import java.io.*; 

public class Solution {
    
    public static List<String> matchSpecificPattern(List<String> 
                                    words, int n, String pattern) {
        List<String> result = new ArrayList<>();
        
        String patternEncoded = getPattern(pattern);
        for(String word : words){
            if(word.length() == pattern.length() &&
             getPattern(word).equals(patternEncoded)){
                 result.add(word);
             }
        }
		return result;
    }
    public static String getPattern(String pattern){
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder st = new StringBuilder();
        int uniqueIndex=0;

        for(char ch : pattern.toCharArray()){
            map.putIfAbsent(ch,uniqueIndex++);
            st.append(map.get(ch));
        }
        return st.toString();
    }

}
