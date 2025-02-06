class Solution {
    public static final int directions[][] = {{0,1},{1,0},{-1,0},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    ans = Math.max(ans,dfs(grid,i,j,m,n));
                }
            }
        }
        return ans;
    }
    public static int dfs(int grid[][], int i, int j,int m,int n){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j] == 0)
            return 0;
        
        // yaha par hum isko visited kr rahe hai but unvisited nhi
        // kr rahe hai kyuki ye wale mein humko dobara visit krna hi nahi 
        // hai usme kyuki har island alag alag hai yaha pr
        grid[i][j] = 0;
        int res = 1;
        for(int dir[] : directions){
            res += dfs(grid, i+dir[0], j+dir[1],m,n);
        }
        return res;
    }
}