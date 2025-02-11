(code 360) 
public class Solution {
 
	public static int findNumber(int n) {
		// Write your code here
		int result =0;
		int power =1;

		n--;
		
		while(n > 0){
			int digit = n% 6;
			result += digit*power;
			power *= 10;
			n /= 6;
		}
		return result;
	}

}
