class Solution {
    public int myAtoi(String s) {
        int n = s.length();

        int max = 2147483647;
        int min = -2147483648;

        int result =0;
        int sign =1;

        int i=0;

        while(i<n && s.charAt(i) == ' '){
            i++;
        }

        if(i<n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            sign = s.charAt(i) == '-' ? -1:1;
            i++;
        }

        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            if(result > (max - digit)/10 ){
                return sign== 1 ? max: min; 
            }
            result = result * 10 + digit;
            i++;
        }
        return sign * result;
    }
}