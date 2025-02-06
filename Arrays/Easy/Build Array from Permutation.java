class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}



// using recursion we can also solve this question
class Solution {
    public void permutation(int[] arr, int i) {
        if (i >= arr.length) {
            return;
        }
        int res = arr[arr[i]];
        permutation(arr, i + 1);
        arr[i] = res;
    }

    public int[] buildArray(int[] nums) {
        permutation(nums, 0);
        return nums;
    }
}