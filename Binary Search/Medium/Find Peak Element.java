class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n ==1)    // Base case 
        return 0;
        int left =0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left+(right - left)/2;
            // taaki jab mid 0 ho to 
            // java.lang.ArrayIndexOutOfBoundsException: 
            // Index -1 out of bounds for length 2
            // ye error na aaye.
            if(mid > 0 && nums[mid] < nums[mid-1])  // left side waala bada hoga
            {
                right = mid -1;
            }
            // taaki jab mid n-1 ho to 
            // java.lang.ArrayIndexOutOfBoundsException: 
            // Index +1 out of bounds for length 2
            // ye error na aaye.
            else if(mid < n-1 && nums[mid] < nums[mid+1]){ // right side waala hoga 
                left = mid +1;
            }
            else 
            return mid;
        }
        return -1;
    }
}



// class Solution {
//     public int findPeakElement(int[] nums) {
//          int n = nums.length;

//         // Handle the case when the array has only one element
//         if (n == 1) {
//             return 0;
//         }

//         // Handle the first element
//         if (nums[0] > nums[1]) {
//             return 0;
//         }

//         // Check for peak elements in the middle of the array
//         for (int i = 1; i < n - 1; i++) {
//             if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
//                 return i;
//             }
//         }

//         // Handle the last element
//         if (nums[n - 1] > nums[n - 2]) {
//             return n - 1;
//         }

//         // Return 0 by default, although this line should not be reached for valid input
//         return 0;
//     }
// }