class Solution {
    public String addStrings(String num1, String num2) {
        int i= num1.length()-1;
        int j = num2.length()-1;
        StringBuilder st = new StringBuilder();
        int carry =0;
        int sum;

        // if there is only one element and it has 9 and 1 then
        // carry > 0 will help to find the addition 
        while(i>=0 || j>=0 || carry>0){
            int digit1 = (i>=0) ? num1.charAt(i--)-'0':0;
            int digit2 = (j>=0) ? num2.charAt(j--)-'0':0;

            sum = digit1 + digit2 + carry;
            st.append(sum%10);
            carry = sum/10;
        }
        return st.reverse().toString();
    }
}