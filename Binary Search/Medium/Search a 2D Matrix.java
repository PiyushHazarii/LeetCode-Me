// this is the brute force method 


// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j] == target) return true;
//             }
//         }
//         return false;
//     }
// }


// this is the better approach



// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//        for(int i=0; i<matrix.length;i++){
//             if(BinarySearch(matrix[i] , target)) return true;
//         }
//         return false;
//     }
//     public boolean BinarySearch(int nums[],int target)
//     {
//         int left = 0;
//         int right = nums.length-1;
//         while(left <= right){
//             int mid = (right+left) / 2;
//             if(nums[mid] == target) return true;
//             else if(nums[mid] < target){
//                 left = mid+1;
//             }else{
//                 right = mid-1;
//             }
//         }
//         return false;
//     }
// }



// this is the  optimal approach



class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = (m*n) - 1;

        // we can made this array into one d array just see the 
        // right and think 
        while(left <= right){
            int mid = left + (right - left)/2;
            int row = mid/n;
            int col = mid%n;
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] < target){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return false;
    }
}


// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int n = matrix.length;
//         int left = 0;
//         int right = matrix[0].length-1;
//         while(left >= 0 && left < n && right>=0 && right < matrix[0].length){
//             if(matrix[left][right] == target)
//             return true;
//             else if(matrix[left][right] > target)
//             right--;
//             else if(matrix[left][right] < target)
//             left++;
//         }
//         return false;
//     }
// }
