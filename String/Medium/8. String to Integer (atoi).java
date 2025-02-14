class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length(), result = 0;
        boolean negative = false;
        // step 1: skip leading whitespaces 
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // step 2 : check if there is a sign agar negative hai to negative = true
        // nhi to positive hai  
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            negative = (s.charAt(i) == '-');
            i++;
        }

        // step 3 : check if there is a digit agar digit hai to usko 
        // result mein add kar lenge
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        // step 4 : return the result agar negative hai to negative return karo
        // nhi to positive return karo
        return negative ? -result : result;
    }
}