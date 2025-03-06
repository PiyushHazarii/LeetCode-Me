class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                // When nums[mid] == nums[right], we cannot determine the smallest
                // by comparing nums[mid] and nums[right], so we just reduce the search space
                right--;
            }
        }
        
        return nums[right];
    }
}
