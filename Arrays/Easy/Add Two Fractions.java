import java.util.* ;
import java.io.*; 
public class Solution {

    public static long[] addFraction(int a, int b, int c, int d) {
        // Write your code here.
        long numerator = (long)a * d +(long) b * c;
        long denomenator = (long)b * d;
        
        long gcd = gcd(numerator, denomenator);
        numerator /= gcd;
        denomenator /= gcd;
        return new long[]{numerator, denomenator};
    }
    public static long gcd(long x, long y){
        while(y != 0){
            long temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

}