class Solution {
    int m;
    int n;
    int nonObstacles;
    int result;
    int directions[][] = {{-1,0},{1,0},{0,-1},{0,1}};
    public int uniquePathsIII(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int count =0;
        int startX =0;
        int startY = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 0){
                    nonObstacles++;
                }

                if(grid[i][j] == 1){
                    startX = i;
                    startY = j;
                }
            }
        }

        nonObstacles += 1; // beacuse we only count the zero one and not the starting one from where we started
        backTrack(grid,startX,startY,count);
        return result;
    }
    public void backTrack(int grid[][], int i, int j, int count){
        // this is the base case from where we return 
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]== -1){
            return;
        }

        // this is the case in which if it equals to 2 but count is not equal to nonObstacles it means it does not cover all the nonobstacles in the grid.so we only reutrn but doesnot increase the result count ;
        if(grid[i][j] == 2){
            if(count == nonObstacles)
            result++;

            return;
        }

        //this is the typical backtrack template  
        grid[i][j] = -1;
        for(int dir[] : directions){
            int newi = i+dir[0];
            int newj = j+dir[1];

            backTrack(grid,newi,newj,count+1);
        }
        grid[i][j] = 0;
    }
}