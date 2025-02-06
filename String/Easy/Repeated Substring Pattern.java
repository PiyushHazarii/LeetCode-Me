class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int i=n/2 ; i>= 1; i--){
            if(n%i == 0){
                int times = n/i;

                String pattern = s.substring(0,i);
                StringBuilder st = new StringBuilder();

                while(times > 0){
                    st.append(pattern);
                    times--;
                }
                if(s.equals(st.toString()))
                    return true;
            }
        }
        return false;
    }
}

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String sub = doubled.substring(1, doubled.length() - 1);
        return sub.contains(s);
    }
}
