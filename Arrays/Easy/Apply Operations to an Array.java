class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];

        for(int i=0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = 2*nums[i];
                nums[i+1] = 0; 
            }
        }
        int count=0;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                arr[count++] = nums[i];
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                arr[count++] = nums[i];
            }
        }
        return arr;
    }
}



// 2nd approach

class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        //Simulation
        int j = 0;
        for(int i = 0; i < n; i++) {
            if(i+1 < n && nums[i] == nums[i+1] && nums[i] != 0) {
                nums[i] *= 2;
                nums[i+1] = 0;
            }

            if(nums[i] != 0) {
                if(i != j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
        }

        return nums;
    }
}