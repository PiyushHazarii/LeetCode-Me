import java.util.* ;
import java.io.*; 

public class Solution {

	public static int digitProduct(int n) {
		// Write your code here.
		if(n==1) return -1;

		List<Integer> list = new ArrayList<>();
		for(int digit=9; digit>=2; digit--){
			while(n%digit == 0){
				list.add(digit);
				n=n/digit;
			}
		}

		if(n>1) return -1;// means the no is not divisible by any
							// of the digits and remainder wiil be there
		
		Collections.sort(list);

		StringBuilder sd = new StringBuilder();
		for(int digit:list){
			sd.append(digit);
		}
		return Integer.parseInt(sd.toString());
	}

}
