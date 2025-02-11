class Solution {
    public void nextPermutation(int[] nums) {
        int index = nums.length-2;

        // yaha pe aise kr rahe hai matlab ki jab tak element 
        // mein downfall nhi aa rha hai tab tak decrease kro 
        // jaise ki 123 mein pehele hi aa gaya hai downfall 
        // to iss loop mein jayega hi nhi agar 321 rehta to 
        // iss loop mein jata kyu ki num[index] > nums[index+1]
        // to index ka value -1 tak chala jata to wo direct reversee
        // wale mein jata kyuki wo last permutation hai thik hai


        while(index>=0 && nums[index] >= nums[index+1]){
            index--;
        }

        // yaha pr agar index -1 nha hai to andar jayega loop ke 
        // and yaha pr hum 2154300 lenge example to sabse phele index
        // milega 1 then hum usme se just bada wala find karenge
        // right sise loop laga kr 3 hai jo usse badda hai to swap kr
        // denge 1 and 3 ko 2354100 hoga
        //  and last mein reverse kr denge kyuki next permutaion find 
        //  krna hai eas liye 

        if(index >= 0){
            int j = nums.length -1;
            while(j>=0 && nums[j] <= nums[index]){
                j--;
            }
            swap(nums,index,j);
        }
        reverse(nums,index+1);
    }
    public void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int nums[], int start){
        int i = start;
        int j = nums.length -1;
        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}