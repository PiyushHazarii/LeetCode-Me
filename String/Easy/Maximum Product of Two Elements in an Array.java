class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int maxproduct = ( nums[n-1] - 1 ) * ( nums[n-2] - 1 );
        return maxproduct;
    }
}

class Solution {
    public int maxProduct(int[] nums) {
        int largest = 0, secondLargest = 0;
        
        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }
        
        return (largest - 1) * (secondLargest - 1);
    }
}
