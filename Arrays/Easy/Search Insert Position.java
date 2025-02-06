// binary serach approach will be there in bs folder


class Solution {
    static int searchInsert(int[] arr, int target) {
            int ind = 0;
    for(int i=0; i<arr.length; i++){
        if(arr[i]<target){
             ind++;
        } 
    } 
        return ind;
    
    }
}