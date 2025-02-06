import java.util.* ;
import java.io.*; 
public class Solution {
	public static String zigzagConversion(String s, int row) {
		// Write your code here.
		if(row == 1) return s;

		StringBuilder []rows = new StringBuilder[row];
		for(int i=0; i<row; i++){
			rows[i] = new StringBuilder();
		}

		int currentRow =0;
		boolean goingDown = false;

		for(char c: s.toCharArray()){
			rows[currentRow].append(c);

			if(currentRow ==0 || currentRow == row -1){
				goingDown = !goingDown;
			}

			currentRow += goingDown ?1: -1;
		}

		StringBuilder ans = new StringBuilder();
		for(StringBuilder sb: rows){
			ans.append(sb);
		}
		return ans.toString();
	}
}
