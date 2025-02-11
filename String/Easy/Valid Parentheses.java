class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(')
                st.push(')');
            else if(ch == '{')
                st.push('}');
            else if(ch == '[')
                st.push(']');
            else if(st.isEmpty() || st.peek() != ch)
            return false;
            else 
            st.pop();
        }
        return st.isEmpty();
    }
}

// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> st = new Stack<>();
//         char ch[] = s.toCharArray();
//         for(char c : ch)
//         {
//             if(st.isEmpty() || c == '(' || c == '{' || c == '[')
//             {
//                 st.push(c);
//                 continue;
//             }
//             if(c == ')')
//             {
//                 if(st.peek() == '(')
//                 {
//                     st.pop();
//                 }
//                 else
//                 {
//                     return false;
//                 }
//             }
//             if(c == '}')
//             {
//                 if(st.peek() == '{')
//                 {
//                     st.pop();
//                 }
//                 else
//                 {
//                     return false;
//                 }
//             }
//             if(c == ']')
//             {
//                 if(st.peek() == '[')
//                 {
//                     st.pop();
//                 }
//                 else
//                 {
//                     return false;
//                 }
//             }
//         }

//         return st.isEmpty();
//     }
// }