import java.util.* ;
import java.io.*; 

public class Solution {

	public static void insertionSort(int n , int[] nums) {
		//  int n = nums.length;

        for (int i = 1; i < n; i++) {
            int key = nums[i];  // Element to be inserted
            int j = i - 1;

            // Move elements of nums[0..i-1] that are greater than key
            // to one position ahead of their current position

            // jab tak chota element milega left mein tab tak chalega
            // and 1 postion ahead kr kr ke add karega 
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            // Insert the key at the correct position
            nums[j + 1] = key;
        }
	}
}
// see the down image for further explanation 
