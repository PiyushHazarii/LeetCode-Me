class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long topSum = 0;
        for(int i=0; i<n; i++){
            topSum += grid[0][i];
        }
        long bottomSum = 0;
        long minSum = Long.MAX_VALUE;

        for(int i=0; i<n; i++){
            topSum -= grid[0][i];
            minSum = Math.min(minSum, Math.max(topSum, bottomSum));
            bottomSum += grid[1][i];
        }
        return minSum;
    }
}