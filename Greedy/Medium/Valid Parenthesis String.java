// this is GREEDY APPROACH

class Solution {
    public boolean checkValidString(String s) {
        int leftMin = 0, leftMax = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                // jab bhi open aayega to dono ko bhadhayenge
                leftMin++;
                leftMax++;
            } else if (c == ')') {
                // jab bhi close aayega to dono ko ghatayenge
                leftMin--;
                leftMax--;
            } else {
                // agar star aaya to leftMin ko ghatayenge and 
                // leftMax wale ko bhadayenge
                leftMin--;
                leftMax++;
            }
            // agar left max 0 se kam hua to return false karega
            // kyuki wo 0 se kam ho hi nhi skta kabhi max hai na
            if (leftMax < 0) {
                return false;
            }
            // left min 0 se kam ho skta kyuki wo min hai
            // ye algorithm hai iska 
            if (leftMin < 0) {
                leftMin = 0;
            }
        }
        return leftMin == 0; 
    }
}
