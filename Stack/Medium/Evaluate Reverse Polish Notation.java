class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")) {
                int b = st.pop();
                int a = st.pop(); 
                st.push(Calculation(a, b, s));
            }
            else 
                st.push(Integer.valueOf(s));
        }
        return st.peek();
    }
    public int Calculation(int a , int b , String s ){
        if(s.equals("-"))
            return a-b;
        else if(s.equals("+"))
            return a+b;
        else if(s.equals("*"))
            return a*b;
        else if(s.equals("/"))
          return a/b;
        return 0;
    }
}