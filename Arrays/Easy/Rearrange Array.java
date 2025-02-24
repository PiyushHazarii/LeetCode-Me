// Problem statement
// You're given an array ARR[] of size N, where every element belongs to the 
// range 0 to N-1. Your task is to rearrange the given array so that ARR[i] 
// becomes ARR[ARR[i]] and make sure that this task is done with O(1) extra space.




import java.util.* ;
import java.io.*; 
public class Solution {

	public static void rearrangeArray(int arr[], int n) {
		// Write your code here.
		for(int i=0; i<n; i++){
			arr[i] = arr[i] + (arr[arr[i]] % n)*n;
		}

		for(int i=0; i<n; i++){
			arr[i] = arr[i]/n;
		}

	}

}