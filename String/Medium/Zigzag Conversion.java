class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        StringBuilder sd = new StringBuilder();
        int increment = 2 * (numRows - 1);

        for(int r=0; r<numRows; r++){
            for(int i=r; i<s.length(); i += increment){
                // pehela character to append krna hi hai 
                // har baar 
                sd.append(s.charAt(i));

                if(r>0 && r<numRows-1 && i+increment - 2*r < s.length()){
                    sd.append(s.charAt(i+increment - 2*r));
                }
            }
        }
        return sd.toString();
    }
}
// time complexity mein 3 no mein hai bus likhne ka tarika mein
//  thoda change kr diya hoga 