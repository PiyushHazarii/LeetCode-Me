// class Solution {
//     public boolean divideArray(int[] nums) {
//         int n = nums.length;
//         Arrays.sort(nums);
//         for(int i = 0 ;i<n-1;i+=2)
//         {
//             if(nums[i] != nums[i+1])
//             {
//                 return false;
//             }
//         }
//         return true;
//     }
// }


class Solution {
    public boolean divideArray(int[] nums) {
        int[] freq = new int[501];
        for(int i : nums){
            freq[i]++;
        }

        for(int i : freq){
            if(i>0){
                if(i%2 != 0)
                    return false;
            }
        }
        return true; 
    }
}