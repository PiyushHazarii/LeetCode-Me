import java.util.* ;
import java.io.*; 
public class Solution {
    public static String reverseOnlyLetters(String s) {
        // Write your code here.
        int n = s.length();
        char ch[] = s.toCharArray();
        int left =0;
        int right =n-1;

        while(left < right){
            if(!Character.isLetter(ch[left])){
                left++;
            }
            else if(!Character.isLetter(ch[right])){
                right--;
            }else{
                char c = ch[left];
                ch[left] = ch[right];
                ch[right] = c;
                left++;
                right--;
            }
        }
        return new String(ch);
    }
}