class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        
        char ch[]=s.toCharArray();
        
        int shift=0;
        // last se shuru kr rahe hai taaki sum milne mein aasani ho
        
        for(int i=s.length()-1;i>=0;i--)
        {
            // 26 mod kr rahe taaki wo 26 ke andar hi rahe uske baahar naa jaa sake
            shift += shifts[i] % 26;

            ch[i] = (char)((ch[i] - 'a' + shift) % 26 + 'a');
            // arr[i] - 97 ye humko kon sa character hai wo batayega (number)
            // + shift ye humko kaha tak shift krna hai wo batayega
            // + 97 ye humko batayega ki jana kaha tak hai mod hone ke 
            //  baad a se uss character tak 
        }
        return String.valueOf(ch);
    }
}

    // eg input 1 
    // s = "abc", shifts = [3,5,9] 
    // intuition : c ko 9 shift krna hai
    //          : b ko 9 + 5 shift krna hai 
    //          : a ko 14+3 shift krna hai