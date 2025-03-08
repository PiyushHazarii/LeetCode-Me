class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int left = getMaxWeight(weights);   // or Arrays.stream(weights).max().getAsInt();
        int right = getSum(weights);
        int result = right;
        while(left <= right){
            int mid = left +(right - left)/2;
            if(canFitInShips(weights,mid,days)){
                result = Math.min(result,mid);
                right = mid -1;
            }
            else 
            left = mid +1;
        }
        return result;
        
    }
    public boolean canFitInShips(int weights[], int mid,int days){
        int countOfShips = 1;
        int sum=0;
        for(int i : weights){
            // jab bhi current se bada ho jaye i then
            // matlan wo elemet ab fit nhi ho skta hai 
            // then hum shipcount++ kr denge and 
            // agar sara saman chala jaye ship mein and
            // countof ship <= day then true hoga then 
            //humko min find krna hoga to right = mid -1 ;
            if(i+sum <= mid){
                sum += i;
            }else{
                countOfShips++;
                sum = i;
            }
        }
        return countOfShips <= days;
    }
    public int getSum(int weights[]){
        int sum =0;
        for(int i : weights)
            sum+=i;

    return sum;
    }
     private int getMaxWeight(int[] weights) {
        int max = weights[0];
        for (int weight : weights) {
            if (weight > max) {
                max = weight;
            }
        }
        return max;
    }
}