class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        
        double maxSum = 0;
        double currentSum = 0;

        // Initialize the sum for the first window of size k
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        
        maxSum = currentSum;

        // Slide the window over the array
        for (int i = k; i < n; i++) {
            currentSum += nums[i];
            currentSum -=  nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum / k;
    }
}
