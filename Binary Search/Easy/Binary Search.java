class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        return BinarySearch(nums,left,right,target);   
    }
    public int BinarySearch(int nums[] ,int left , int right,int target)
    {
        while(left <= right)
        {
            int mid = (left+right)/2;
            if(nums[mid] == target)
            return mid;
            if(nums[mid] > target)
            return BinarySearch(nums,left,mid-1,target);
            else
            return BinarySearch(nums,mid+1,right,target);
        }
        return -1;
    }
}


class Solution {
    public int search(int[] nums, int target) {
        int left = 0; // initialize left pointer to 0
        int right = nums.length - 1; // initialize right pointer to the last index of the array
        
        while (left <= right) { // continue the loop till left pointer is less than or equal to right pointer
            int mid = left + (right - left) / 2; // calculate the middle index of the array
            
            if (nums[mid] == target) { // check if the middle element is equal to target
                return mid; // return the middle index
            } else if (nums[mid] < target) { // check if the middle element is less than target
                left = mid + 1; // move the left pointer to the right of middle element
            } else { // if the middle element is greater than target
                right = mid - 1; // move the right pointer to the left of middle element
            }
        }
        
        return -1; // target not found in the array
    }
}
