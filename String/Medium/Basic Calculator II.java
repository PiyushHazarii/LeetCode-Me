class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int n = s.length();
        char sign = '+';

        for(int i=0; i<n; i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                int val = 0;
                while(i<n && Character.isDigit(s.charAt(i))){
                    val = val*10 +(s.charAt(i)-'0');
                    i++;
                }
                // ye hum eassi liye kr rahe hai kyuki i++ ho chuka hai ek zyda 
                // eassi hum usko ghata rahe hai eg 123+5 hai to i =0 mein loop mein
                // enter hoga then 2 baar chalega to  3 ho jayega to  baad to for loop
                // usko aur ek bhada dega to + ya - skip ho jayega essiliye i--
                // kar rahe hai
                i--;
                if(sign == '+')
                    st.push(val);

                else if(sign == '-')
                    st.push(-val);

                else if(sign == '*'){
                    int a = st.pop();
                    int ans = a*val;
                    st.push(ans);
                }else{
                    int a = st.pop();
                    int ans = a/val;
                    st.push(ans);
                }

            }else if(c != ' ')
                sign = c;
        }

        int sum =0;
        while(st.size() > 0)
            sum += st.pop();

        return sum;
    }
}