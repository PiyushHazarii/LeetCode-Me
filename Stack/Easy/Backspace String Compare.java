class Solution {
    public boolean backspaceCompare(String S, String T) {
    //     return build(S).equals(build(T));
    // }

    // public String build(String S) {
    //     Stack<Character> ans = new Stack();
    //     for (char c: S.toCharArray()) {
    //         if (c != '#')
    //             ans.push(c);

    //         else if(!ans.empty()) 
    //             ans.pop();
    //     }
    //     return String.valueOf(ans);
    // }

    int i=S.length()-1;
    int j=T.length()-1;

    int skip_s=0;
    int skip_t=0;

    while(i>=0 || j>=0){
        while(i >= 0){
            if(S.charAt(i) == '#'){
                skip_s++;
                i--;
            }else if(skip_s > 0){
                skip_s--;
                i--;
            }else{
                break;
            }
        }

        while(j >= 0){
            if(T.charAt(j) == '#'){
                skip_t++;
                j--;
            }else if(skip_t> 0){
                skip_t--;
                j--;
            }else{
                break;
            }
        }

        char first = (i < 0) ? '$' : S.charAt(i);
        char second = (j < 0) ? '$' : T.charAt(j);

        if(first != second)
            return false;
        i--;
        j--;
    }
    return true;

    }
}