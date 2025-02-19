// class NumArray {
//     int arr[];
//     public NumArray(int[] nums) {
//         int n = nums.length;
//         arr = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i] = nums[i];
//         }
//     }
    
//     public int sumRange(int left, int right) {
//         int sum =0;
//         for(int i=left; i<=right; i++){
//             sum += arr[i];
//         }
//         return sum;
//     }
// }



class NumArray {
    int[] nums;
    int[] prefixNums;

    public NumArray(int[] nums) {
        this.nums = nums;
        this.prefixNums = new int[nums.length+1];
        int currentSum =0;

        
        for(int i=0;i<=nums.length-1;i++){
            prefixNums[i] = nums[i]+ currentSum;
        }
    }

     public int sumRange(int left, int right) {

        if (left == 0){
            return prefixNums[right];
        }else{
            return prefixNums[right]-prefixNums[left-1];
        }
  
    }

}


