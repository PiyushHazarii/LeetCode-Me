import java.util.* ;
import java.io.*; 
public class Solution {
  public static int sumOfMaxMin(int[] arr, int n) {
      // Write your code here.
      // int largest = Arrays.stream(arr).max().getAsInt();
      // int smallest = Arrays.stream(arr).min().getAsInt();
      // return largest+smallest;

      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      for(int i =0;i<n; i++){
        int current = arr[i];
        if(current < min){
          min = current;
        }
        if(current > max){
          max = current;
        }
      }
      return min+max;
  }
}