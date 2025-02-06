class Solution {
    public int[] sortedSquares(int[] nums) {

        // this is the brute force approach 

        // int arr[] = new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     arr[i] = nums[i]*nums[i];
        // }
        // Arrays.sort(arr);
        // return arr;


        // this is the optimal approach O(n);


        // here is the loop hole is that there is a min
        // in between the negative one and the positive one 

        int n = nums.length;
        int arr[] = new int[nums.length];

        int left = 0;
        int right = n-1;
        int count = n-1;
        while(left <= right){
            int leftS = nums[left] * nums[left];
            int rightS = nums[right] * nums[right];
            if(leftS < rightS){
                arr[count--] = rightS;
                right--;
            }else{
                arr[count--] = leftS;
                left++;
            }
        }
        return arr;
    }
}
