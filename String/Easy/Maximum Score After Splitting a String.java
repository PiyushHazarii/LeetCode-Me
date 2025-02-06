public class Solution {
    public int maxScore(String s) {
        int zero = 0;
        int one = 0;

        // Count the total number of 1's in the string
        for (char c : s.toCharArray()) {
            if (c == '1') {
                one++;
            }
        }

        int res = 0;

        // Iterate through the string but stop before the last character
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zero++; // Increment count of zeroes
            } else {
                one--; // Decrement count of ones
            }

            // Update the maximum score
            res = Math.max(res, zero + one);
        }

        return res;
    }

}
