class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry =0;

        StringBuilder str = new StringBuilder();
        while(i>=0 || j>=0 || carry != 0){
            int ival = (i>=0)?a.charAt(i)-'0':0;

            int jval = (j>=0)?b.charAt(j)-'0':0;
            i--;
            j--;
            int sum = ival + jval + carry;
            // int val = sum % 2;
            str.append(sum % 2);
            carry = sum/2; 
        }
        return str.reverse().toString();
    }
}
