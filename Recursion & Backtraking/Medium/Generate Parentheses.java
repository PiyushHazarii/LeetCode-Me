class Solution {
    public List<String> generateParenthesis(int n) {
        int open =0;
        int close =0;
        List<String> list = new ArrayList<>();
        generate("",n,0,list,open,close);
        return list;
    }
    public void generate(String s , int n , int length,List<String> list,int open ,int close){
        if(length == 2*n){
            list.add(s);
            return;
        }

        if(open < n){
            s += '(';
            generate(s,n,length+1,list,open+1,close);
            // this is the step where we pop ( and put ) in the another statement
            s = s.substring(0, s.length() - 1); 
        } 

        if(close < open){
            s+= ')';
            generate(s,n,length+1,list,open,close+1);
        }
    }
}


// in the brute force method we can call all the possible parenthesis with the help of isvVald
// fuction by using stack or counter variable and if it is valid then we can cosider 
// it as valid parenthesis and we can add it to the list and move further.