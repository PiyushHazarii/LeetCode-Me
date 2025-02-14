class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        Set<Integer> set = new HashSet<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }else if(s.charAt(i) == ')'){
                if(st.isEmpty()){
                    set.add(i);
                }else{
                    st.pop();
                }
            }
        }

        while(!st.isEmpty()){
            set.add(st.pop());
        }

        String result ="";
        for(int i=0; i<n; i++){
            if(!set.contains(i)){
                result += s.charAt(i);
            }
        }
        return result;
    }
}