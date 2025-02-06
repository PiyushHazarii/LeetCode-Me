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