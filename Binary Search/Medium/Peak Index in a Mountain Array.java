class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        // this is the array approach 

        // for(int i=1;i<arr.length-1;i++){
        //     if(arr[i]>arr[i+1]&&arr[i]>arr[i-1])
        //     return i;
        // }
        // return -1;


        // this is the binary search approach

        int n = arr.length;
        int left =0;
        int right = n-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(arr[mid] < arr[mid+1])
            left = mid + 1;
            else 
            right = mid;
        }
        return left;  // yaha pe dono valid hoga left aur right because dono 
                    // at last same jagah pe end ho raha hai
    }
}