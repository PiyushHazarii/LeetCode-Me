class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String []a = path.split("/");

        for(String i:a){
            if(i.equals("..") && !st.isEmpty()){
                st.pop();
            }else if(!i.equals(".") && !i.equals("") && !i.equals(".."))
                st.push(i);
        }

        StringBuilder sb = new StringBuilder();
        for(String i : st){
            sb.append("/");
            sb.append(i);
        }

        // agar sirf . ya .. diya hai to kuch bhi enter nhi karenge
        // stack mein to uss case ke liye "/" ko return krna 
        // hoga eas liye ye wala dena pada
        return sb.length() == 0 ? "/":sb.toString();
    }
}