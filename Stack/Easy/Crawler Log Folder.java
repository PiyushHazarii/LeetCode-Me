// array approach will be there in array folder
// stack approach 

class Solution {
    public int minOperations(String[] logs) {
        Stack<String> s = new Stack<>();
        for (String log : logs){
            if (log.equals("../")){
                // agar stack empty nahi hai to hi pop karenge nhi to nahi karenge 
                if (!s.isEmpty()){
                    s.pop();
                }
            }
            else if (!log.equals("./")){
                s.push(log);
            }
        }
        int res = 0;
        while (!s.isEmpty()){
            res++;
            s.pop();
        }
        return res;
    }
}