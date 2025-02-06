class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int row[] = new int[m];
        int col[] = new int[n];

        // jis row mein hoga uss row ka  count bhada denge and jis column mein hoga 
        // uss column mein hoga uss column mein hoga uss column ka count bhada denge 
        // taki jab bhi humko 1 mile to hum check kare ki agar uss column ka ya 
        // row ka count agar 1 se bhada hoga to hum uska count result mein add karenge
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        int result =0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1 && (row[i] > 1 || col[j] > 1)){
                    result++;
                }
            }
        }
        return result;
    }
}