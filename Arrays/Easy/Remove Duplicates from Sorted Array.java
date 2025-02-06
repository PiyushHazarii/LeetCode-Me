class Solution {
    public int removeDuplicates(int[] nums) {
         // we start j from 1 because how can we check that the zeroth 
        // element with anyone so we start checking by one only 
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}