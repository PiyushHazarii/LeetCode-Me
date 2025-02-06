import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static boolean ninjaGram(String str) {

		// Write your code here
		int n = str.length();
		if(n < 26) return false;

		str = str.toLowerCase();

		int ch[] = new int[26];

		for(char c : str.toCharArray()){
			if(c >= 'a' && c <= 'z'){
				ch[c-'a']++;
			}
		}

		for(int i=0; i<26; i++){
			if(ch[i] == 0)
				return false;
		}
		return true;
	}
}