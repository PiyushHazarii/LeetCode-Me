import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<ArrayList<Character>> interestingPattern(int N) {

		// Write your code here.
		ArrayList<ArrayList<Character>> ans = new ArrayList<>();

		for(int i=0; i<N; i++){
			ArrayList<Character> list = new ArrayList<>();

			// yaha pr wo Character le rahe hai jo ki aa raha hai
			// jaise ki pehele E aayega then
			char ch = (char)('A' + N-i-1);

			// char c ko e se kam ya equal tak chalayenge taaki
			// E add ho jaye row mein and then ans mein add kr denge
			for(char c=ch; c<= 'A'+ N-1; c++){
				list.add(c);
			}
			ans.add(list);
		}
		return ans;
	}
}