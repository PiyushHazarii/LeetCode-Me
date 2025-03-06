import java.math.BigInteger;
public class Solution {
	public static void factorial(int n) {
        // BigInteger is used to store large numbers
		BigInteger fact = BigInteger.ONE;

		for(int i=1; i<=n; i++){
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);
	}
}
