class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        
        char arr[]=s.toCharArray();
        
        int shift=0;
        
        for(int i=s.length()-1;i>=0;i--)
        {
            // 26 mod kr rahe taaki wo 26 ke andar hi rahe uske baahar naa jaa sake
            shift += shifts[i] % 26;

            arr[i] = (char)((arr[i] - 97 + shift) % 26 + 97);
            // arr[i] - 97 ye humko kon sa character hai wo batayega (number)
            // + shift ye humko kaha tak shift krna hai wo batayega
            // + 97 ye humko batayega ki jana kaha tak hai mod hone ke baad 
        }
        return String.valueOf(arr);
    }
}