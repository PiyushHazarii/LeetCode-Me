import java.util.* ;
import java.io.*; 
public class Solution {
    public static Boolean isReflectionEqual(String s) {
        // Write your code here.
        Set<Character> set = new HashSet<>(
            Arrays.asList('A','H','I','M','O','T','U','V','W','X','Y')
        );

        for(int i=0; i<s.length(); i++){
            if(!set.contains(s.charAt(i)))
                return false;
            
            // we also check for the palindrome then only it 
            // will same in the mirror

            if(s.charAt(i) != s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
}
