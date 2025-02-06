class Solution {
    public String intToRoman(int num) {
        String[][] symList = {
            {"I", "1"}, {"IV", "4"}, {"V", "5"}, {"IX", "9"},
            {"X", "10"}, {"XL", "40"}, {"L", "50"}, {"XC", "90"},
            {"C", "100"}, {"CD", "400"}, {"D", "500"}, {"CM", "900"},
            {"M", "1000"}
        };

        StringBuilder sb = new StringBuilder();

        for(int i= symList.length-1;i>=0; i--){
            String first = symList[i][0];
            int number = Integer.parseInt(symList[i][1]);

            // agar divide hoga to hi add karenge string nein nhi 
            // to nahi karenge kyuki jab divide hoga tabhi to 
            // uske string lenge hum aur add karenge 
            // number se divide kr rahe hai kyuki agar 
            // number se chota hua to uska wala number nhi lenge 
            // then agle mein try karenge and all set
            if(num / number > 0){
                int count = num/number;
                for(int j=0; j<count; j++){
                    sb.append(first);
                }
                num %= number;
            }
        }
        return sb.toString();
    }
}