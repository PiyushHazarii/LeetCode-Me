class Solution {
    public int countEven(int num) {
        int temp=num;
        int sum=0;
        
        while(num!=0){
            sum+=num%10;
            num=num/10;
        }
        
        return sum%2==0 ? temp/2 : (temp-1)/2;
    }
}