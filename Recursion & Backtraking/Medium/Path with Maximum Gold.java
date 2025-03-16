class Solution {
    int directions[][] = {{1,0},{0,-1},{0,1},{-1,0}}; 
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxGold =0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] != 0){
                   maxGold= Math.max(maxGold, DFS(grid,i,j,n,m));
                }
            }
        }
        return maxGold;
    }
    public int DFS(int grid[][], int i, int j, int n, int m){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j] == 0)
        return 0;

        int originalValue = grid[i][j];
        grid[i][j] = 0;

        int maxGold =0;
        for(int dir[]:directions){
            int newi = i + dir[0];
            int newj = j + dir[1];

            maxGold = Math.max(maxGold,DFS(grid, newi , newj,n,m));
        }
        grid[i][j] = originalValue;
        // original val iss liye le rahe hai kyui
        // uss wale index ho bhi add krna hai
        // maxgold to uske left right up and down se max
        // laake de raha hai na issi liye 
        // original value+maxGold.
        return originalValue + maxGold;
    }
}