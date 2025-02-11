import java.util.* ;
import java.io.*; 
// code(360)
public class Solution {

	public static List<List<Integer>> fahrenheitToCelsius(int s, int e, int w) {
		// Write your code here
		 List<List<Integer>> ans = new ArrayList<>();

		 for(int far =s; far<=e; far+=w){
            // formula to find the celsius from farhenheit 
			 int cel = (far-32) * 5/9;
			 List<Integer> list = new ArrayList<>();
			 list.add(far);
			 list.add(cel);
			 ans.add(list);
		 }
		 return ans;
	}

}
