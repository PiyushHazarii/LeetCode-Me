import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int concatLargestDigit(int a, int b, int c)
    {
        return Integer.parseInt(getLargestDigit(a) + "" + getLargestDigit(b) + "" + getLargestDigit(c));
    }

    private static int getLargestDigit(int num) {
        int maxDigit = 0;
        while (num > 0) {
            maxDigit = Math.max(maxDigit, num % 10);
            num /= 10;
        }
        return maxDigit;
    }
}