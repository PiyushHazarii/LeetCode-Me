class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int arr[] = new int[n];
        int count =0;
        for(int i : nums)
        {
            if(i < pivot)
            {
                arr[count] = i;
                count++;
            }
        }
        for(int i : nums)
        {
            if(i == pivot)
            {
                arr[count] = i;
                count++;
            }
        }
        for(int i : nums)
        {
            if(i > pivot)
            {
                arr[count] = i;
                count++;
            }
        }
        return arr;
    }
}