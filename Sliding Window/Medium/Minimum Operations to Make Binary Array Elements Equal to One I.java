// // this is TLE Solution and done by me.
// class Solution {
//     public int minOperations(int[] nums) {
//         int count = 0;
//         for (int i = 0; i <= nums.length - 3; i++) {  // Fix loop range
//             if (nums[i] == 0) {
//                 operations(nums, i);
//                 count++;
//             }
//             if (allOne(nums)) {  // Fix function call
//                 return count;
//             }
//         }
//         return -1;
//     }

//     public static void operations(int nums[], int index) {
//         for (int i = index; i < index + 3 && i < nums.length; i++) { // Fix flipping range
//             nums[i] = nums[i] == 0 ? 1 : 0;
//         }
//     }

//     public static boolean allOne(int nums[]) { // Fix function name
//         for (int i : nums) {
//             if (i == 0) { // Check if any zero remains
//                 return false;
//             }
//         }
//         return true;
//     }
// }





class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int i = 0, j = 2, ans = 0;
        
        // this will do the steps accordig to the question
        while (j < n) {
            if (nums[i] == 0) {
                ans++;
                for (int k = i; k < i + 3; k++) {
                    nums[k] = (nums[k] == 0) ? 1 : 0;
                }
            }
            i++;
            j++;
        }
        
        // this checks for if there is all  one or not...
        for (int m = 0; m < n; m++) {
            if (nums[m] == 0) {
                return -1;
            }
        }
        
        return ans;
    }
}