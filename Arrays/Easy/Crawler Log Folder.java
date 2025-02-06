class Solution {
    public int minOperations(String[] logs) {
        int res = 0;
        for(int i=0; i<logs.length; i++){
            if(logs[i].equals("./"))
                continue;
            else if(logs[i].equals("../"))
                res = Math.max(0, res-1);
            else 
                res += 1;
        }
        return res;
    }
}

// stack approach 

class Solution {
    public int minOperations(String[] logs) {
        Stack<String> s = new Stack<>();
        for (String log : logs){
            if (log.equals("../")){
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