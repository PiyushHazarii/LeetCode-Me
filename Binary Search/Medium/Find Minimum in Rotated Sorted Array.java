class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left =0;
        int right = n-1;
        while(left < right)
        {
            int mid = left + (right-left)/2;
            if(nums[mid] > nums[right])
            left = mid+1;
            else
            right = mid;
        }
        return nums[right];
    }
}




// // this is the brute force method
class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}



// O(n)
class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        for(int i=1; i<nums.length; i++){
            min = Math.min(min,nums[i]);
        }
        return min;
    }
}
