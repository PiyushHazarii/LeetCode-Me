
class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        if(low < high){
            int pivotIndex = partition(arr,low,high);
            
            quickSort(arr,low, pivotIndex-1);
            
            quickSort(arr, pivotIndex+1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int left = low + 1;
        int right = high;
        
        
        while(left <= right){
            while(left <= right && arr[left] <= pivot){
                left++;
            }
            while(left <= right && arr[right] > pivot){
                right--;
            }
            
            if(left < right){
                swap(arr, left, right);
            }
            
        }
        swap(arr,low, right);
            return right;
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
