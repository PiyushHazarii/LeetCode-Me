
this is the two stack approach  same as 2116. Check if a Parentheses String Can Be Valid

class Solution {
    public boolean checkValidString(String s) {
        Stack <Integer> stack=new Stack<>();
        Stack <Integer> starstack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            if(s.charAt(i)=='*'){
                starstack.push(i);
            }
            if(s.charAt(i)==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else if(!starstack.isEmpty()){
                    starstack.pop();
                }
                else{
                    return false;
                }
            }
        }
        while(!stack.empty() && !starstack.empty()){
            if(stack.peek()<starstack.peek()){
                stack.pop();
                starstack.pop();
            }
            else{
                return false;
            }
        }
        return stack.empty();
        
    }
}