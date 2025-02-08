class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE / 2; 
        for(int i=0;i<n; i++){
            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum= nums[i]+nums[left]+nums[right];
                if(Math.abs(target - sum) < Math.abs(target-closest)){
                    closest = sum;
                }
                if(sum < target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return closest;
    }
}