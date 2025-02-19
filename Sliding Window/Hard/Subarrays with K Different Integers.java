class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return countSubaaray(nums,k)-countSubaaray(nums,k-1);
    }
    public static int countSubaaray(int nums[], int k){
        int n = nums.length;
        int left =0;
        int right =0;
        int count =0;
        Map<Integer, Integer> map = new HashMap<>();

        while(right < n){
            map.put(nums[right], map.getOrDefault(nums[right],0)+1);

            while(map.size() > k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
            count += right - left + 1;
            right++;
        }
        return count;
    }
}