import java.util.*;
public class Solution {
	public static boolean isGoodNumber(int n) {
		// Write your code here.
		Set<Integer> set = new HashSet<>();

		while(n!=1){
			if(set.contains(n)){
				return false;
			}
			set.add(n);
			n= square(n);
		}
		return true;
	}
	public static int square(int n){
		int sum=0;
		while(n > 0){
			int digit = n% 10;
			sum += digit * digit;
			n = n/10;
		}
		return sum;
	}
}