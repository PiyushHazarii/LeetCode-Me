class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        // i have created this array because when there is 99 or
        // 999 or 9 or 99999 then we have to create an another array
        int newArray[] = new int[n+1];
        newArray[0] = 1;
        return newArray;
    }
}
