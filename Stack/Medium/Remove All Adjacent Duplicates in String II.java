class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pairs> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && stack.peek().character == s.charAt(i))
                stack.peek().count++;
            else 
                stack.push(new Pairs(s.charAt(i),1));

            if(stack.peek().count==k)
                stack.pop();
        }

        
        StringBuilder st = new StringBuilder();

        // itne baar repeat krna padega jitne baar stack mei hai
            for(Pairs pair : stack)
            st.append(String.valueOf(pair.character).repeat(pair.count));
        return st.toString();
    }
    // this is the static class  that is initiate automatically we dont need to crate the object of this class
    public static class Pairs
    {
        char character;
        int count;
        Pairs(char ch,int c)
        {
            this.character=ch;
            this.count = c;
        }
    }
}