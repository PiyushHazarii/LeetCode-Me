public class Solution {
    public static int countDigits(int n) {
        int original = n;  // Store the original number
        int count = 0;

        while (n != 0) {
            int digit = n % 10;  // Extract the last digit
            if (digit != 0 && original % digit == 0) {
                count++;  // Increment count if the digit evenly divides the original number
            }
            n = n / 10;  // Remove the last digit
        }

        return count;
    }
}
