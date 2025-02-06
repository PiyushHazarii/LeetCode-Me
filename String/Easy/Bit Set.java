import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findFirstRepeatingDigit(String digitPattern) {
        // Write your code here.
        Set<Character> set = new HashSet<>();
        char c[] = digitPattern.toCharArray();
        for(char cc:c){
            if(set.contains(cc)){
                return cc-'0';
            }
            set.add(cc);
        }
        return -1;
    }
}
