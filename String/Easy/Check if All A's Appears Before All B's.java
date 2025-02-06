class Solution {
    public boolean checkString(String s) {
        // boolean helperA = true;
        // boolean bb = false;
        // for(int i=0; i<s.length(); i++){
        //     if(s.charAt(i) == 'a' && bb == false){
        //         helperA = true;
        //     }else if(s.charAt(i) == 'a' && bb == true){
        //         return false;
        //     }else{
        //         bb = true;
        //     }
        // }
        // return helperA;



        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i - 1) == 'b' && s.charAt(i) == 'a') {
                return false;
            }
        }
        return true;
    }
}

    