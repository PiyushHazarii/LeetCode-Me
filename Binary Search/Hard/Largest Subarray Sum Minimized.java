// same code like split array largest sum
public class Solution {
    public static int largestSubarraySumMinimized(int []nums, int k) {
        // Write Your Code Here
        int n = nums.length;
        int left = getMaxWeight(nums);   // or Arrays.stream(nums).max().getAsInt();
        int right = getSum(nums);
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            int subArrayCount = find(nums, mid);
            
            if(subArrayCount > k){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static int getSum(int nums[]) {
        int sum = 0;
        for(int i : nums)
            sum += i;
        return sum;
    }

    public static int getMaxWeight(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int find(int nums[], int max) {
        int count = 1;
        int sum = 0;

        for(int i : nums) {
            if(i + sum <= max) {
                sum += i;
            } else {
                count++;
                sum = i;
            }
        }
        return count;
    }
}





