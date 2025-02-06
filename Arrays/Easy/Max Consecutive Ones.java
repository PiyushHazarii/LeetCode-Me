// binary search approach will be there 
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int right =0;
        int count =0;
        int max = Integer.MIN_VALUE;
        while(right < nums.length){
            if(nums[right] == 1){
            count++;
            }else{
                max = Math.max(max,count);
                count=0;
            }
            right++;
        }
        max = Math.max(count , max);

        return max;
    }
}