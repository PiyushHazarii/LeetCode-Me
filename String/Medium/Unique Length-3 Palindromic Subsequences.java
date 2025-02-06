class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        Set<Character> set = new HashSet();

        // set mein add kr rahe hai kyuki humko itereate  krna hai unique mein eas liye
        for(int i=0; i<n; i++){
            set.add(s.charAt(i));
        }
        int result =0;

        for(char ch : set) {
            int left_idx  = -1;
            int right_idx = -1;

            for(int i=0; i<n; i++){
                
                if(s.charAt(i) == ch){

                    // yaha par hum left_idx ko -1 ke sath rakhe hai kyuki humko pehela
                    // left_idx chaiye essi liye uske alawa isko update nhi krna hai
                    if(left_idx == -1){
                        left_idx = i;
                    }
                    // yaha pr koi check eas liye nhi daale hai kyuki humko last indexes
                    // chaiye iska essi liye tabhi na hum iske beech ka element find 
                    // kr payenge aur add karenge set mein
                    right_idx = i;
                }
            }

            Set<Character> results = new HashSet();

            // left_idx se +1 aur right_idx se -1 tak chalayenge taaki humko
            // beech ka mil jaye element so that usko add kr de set mein
            for(int middle = left_idx+1; middle <= right_idx-1; middle++){
                results.add(s.charAt(middle));
            }
            result += results.size();
        }
        return result;
    }
}