import java.util.* ;
import java.io.*; 
public class Solution {
    public static String maximumDifference(int n, int[] arr) {
        // Write your code here.
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int sum = max - min;

        if(sum %2 ==0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
        return "";
    }
}