import java.util.* ;
import java.io.*; 
public class Solution {
	public static void selectionSort(int arr[], int n) {
		// Write your code here.
		for(int i=0; i<n-1; i++){
			// take the first index as min index and 
			// then find the minimum element index that is 
			// smaller than arr[min-index] and
			// then swap it 
			int min_index = i;

			for(int j=i+1; j<n; j++){
				if(arr[min_index] > arr[j]){
					min_index = j;
				}
			}

			// After finding the min_index then we have to 
			// swap it with the first element that is i
			
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;

		}
	}
}