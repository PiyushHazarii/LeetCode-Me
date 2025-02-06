// class Solution {
//     public int duplicateNumbersXOR(int[] nums) {
//         int xor=0;
//         Arrays.sort(nums);
//         for(int i=0; i<nums.length-1; i++){
//             if(nums[i] == nums [i+1]){
//                 xor=xor^nums[i];
//                 i++;
//             }
//         }
//         return xor;
//     }
// }




class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int ans=0;
        int a[]=new int[51];
        for(int i:nums)
        {
            a[i]++;
        }
        for(int i=1;i<=50;i++)
        {
            if(a[i]==2)
            {
                ans^=i;
            }
        }
        return ans;
    }
}