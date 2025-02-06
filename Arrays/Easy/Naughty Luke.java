import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[][] getFinalGrid(int a[][], int n) {
        // Write your code here.
        // this is the code for reversing the matrix 
        //  as the figure shows that (twist means reverse just)
        int t[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                t[i][j] = a[i][n-j-1];
            }
        }

        // then jaha pr bhi 1 milega waha 0 daalna hai and jaha
        // pr bhi 0 milega waha pr 1 daalna hai

        int f[][]= new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                f[i][j] = (t[i][j] == 1) ? 0:1;
            }
        }
        return f;

    }
}