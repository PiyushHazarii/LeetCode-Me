import java.util.* ;
import java.io.*; 
public class Solution {
    public static Boolean splitString(String str) {
        // Write your code here..
        String s1 = str.substring(0,str.length()/2);
        String s2 = str.substring(str.length()/2);
        int count1 = vowelCount(s1);
        int count2 = vowelCount(s2);
        if(count1 == count2) 
            return true;
        return false;
    }
    public static int vowelCount(String s){
        String vowels = "aeiouAEIOU";
        int count =0;
        for(int i=0; i<s.length(); i++){
            if(vowels.contains(String.valueOf(s.charAt(i)))){
                count++;
            }
        }
        return count;
    }
}