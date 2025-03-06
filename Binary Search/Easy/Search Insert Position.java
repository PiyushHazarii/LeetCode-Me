// O(logn)
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] < target){
                left= mid +1;
            }
            else
                right = mid-1;
        }
        return left;
    }
}



// O(n)
class Solution {
    static int searchInsert(int[] arr, int target) {
            int ind = 0;
    for(int i=0; i<arr.length; i++){
        if(arr[i]<target){
             ind++;
        } 
    } 
        return ind;
    
    }
}