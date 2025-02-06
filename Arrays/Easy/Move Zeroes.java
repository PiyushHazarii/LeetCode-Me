class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 0) return;

        int count =0;
        for(int n : nums){
            if(n != 0) 
            nums[count++] = n;
        }
        while(count < nums.length)
        nums[count++] = 0;
    }
}



class Solution {

    public static void moveZeroes(int[] nums) {
        int index=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                index++;
            }
        }
        
    }
}