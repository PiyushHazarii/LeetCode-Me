class Solution {
    public String smallestNumber(String pattern) {
        Stack<Character> st = new Stack<>();
        StringBuilder sd = new StringBuilder();
        int count = 1;

        for(int i=0; i<=pattern.length(); i++){
            // ye char mein convert krke daal denga matlab 0 se plus 
            // krke daal rahe hai na to wo char mein convert kr dega
            // string mein rehne nhi dega

            st.push((char) ('0'+count++));

            // jab bhi I aaye to pop kr do stack se and daal do strinf
            // builder mein and then agar last mein ddd hai to i == n
            // to uske liye bhi ek check hai ki i==n to pop kr do
            if(i == pattern.length() || pattern.charAt(i) == 'I'){
                while(!st.isEmpty()){
                    sd.append(st.pop());
                }
            }
        }
        return sd.toString();
    }
}