class Solution {
    public int diagonalSum(int[][] mat) {
         int sum = 0;
        int n = mat.length;
        for(int i=0;i<n;i++)
        {
            sum += mat[i][i]+mat[i][n-1-i];
        }

        // agar odd rahega to n/2 n/2 minus kr denge kyuki do baar repeat ho 
        // raha hai jab add karenge to agar odd rahega to//
        if(n % 2 != 0)
        {
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
}