class Solution {
    public int[] productExceptSelf(int[] nums) {

        // int n = nums.length; int ans[] = new int[n];
        // int left =1;  int right =1;
        // for(int i=0;i<n;i++){
        //     ans[i] = left;
        //     left *= nums[i];
        // }
        // for(int i=n-1;i>=0;i--){
        //     ans[i] *= right;
        //     right *= nums[i];
        // }
        // return ans;

        

        // this is the derivation vertion of the upper code 
        // means i can derive the above code into another another 
        // array and then calculate the ans

         int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }
}