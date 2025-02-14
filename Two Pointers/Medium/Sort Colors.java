class Solution {
    public void sortColors(int[] nums) {
        // two pointer approach
        int n = nums.length;
        int i=0;
        int j=0;
        int k=n-1;
        while(j<=k){
            if(nums[j] == 2){
                int temp = nums[j];
                nums[j]=nums[k];
                nums[k]= temp;
                k--;
            }
            else if(nums[j]==1){
                j++;
            }
            else{
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i]= temp;
                i++;
                j++;
            }
        }

        // or this is also a approach given in the comments
        int zero = 0;
        int one = 0;
        int two = 0;

        // Count occurrences of 0, 1, and 2
        for (int val : nums) {
            if (val == 0) zero++;
            else if (val == 1) one++;
            else two++;
        }

        // Overwrite array with sorted values
        int i = 0;
        while (zero != 0) {
            nums[i++] = 0;
            zero--;
        }
        while (one != 0) {
            nums[i++] = 1;
            one--;
        }
        while (two != 0) {
            nums[i++] = 2;
            two--;
        }
    }

    }
}

// another way of writing the approach 1 

int i=0;
int j =0;
int k = n-1;

while(j <= k){
    if(nums[j] == 1){
        // because it is the postioon of 1 that is why we just j++
        j++;
    }else if(nums[j] == 2){
        // agar nums[j] == 2 matlab ye to pakka last nein hi jayega
        swap(nums[j], nums[k]);
        k--;
    }else{
        swap(nums[j], nums[i]);
        i++;
        j++;
        // because both are starting from the same point 
    }
}

public static void swap(int i, int j){
    int temp = i;
    i = j;
    j=temp;
}