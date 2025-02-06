class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int maxLocal[][] = new int[n-2][n-2];
        for(int i =0;i<n-2;i++)
        {
            for(int j=0;j<n-2;j++)
            {
                maxLocal[i][j] = findmax(grid,i,j);
            }
        }
       
        return maxLocal;
    }
    public int findmax(int[][] arr, int istart, int jstart)
    {
        int max = Integer.MIN_VALUE;
        for(int i=istart;i<istart+3;i++)
        {
            for(int j = jstart;j<jstart+3;j++)
            {
                max = Math.max(max,arr[i][j]);
            }
        }
        return max;
    }
}