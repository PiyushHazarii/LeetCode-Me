//  In this we have to move in 8 DIRECTIONS so we again write this here 


public class Solution 
{
    public static int getTotalIslands(int[][] mat) 
	{
         int n = mat.length;    // Number of rows
        int m = mat[0].length; // Number of columns
        boolean[][] visited = new boolean[n][m]; // Track visited cells
        int islandCount = 0;   // Count of islands

        // Traverse the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1 && !visited[i][j]) {
                    // Start a DFS to explore this island
                    dfs(mat, visited, i, j, n, m);
                    islandCount++; // Increment island count
                }
            }
        }

        return islandCount;
    }

    // Helper method to perform DFS
    private static void dfs(int[][] mat, boolean[][] visited, int row, int col, int n, int m) {
        // Base condition: Check matrix bounds and if cell is valid
        if (row < 0 || col < 0 || row >= n || col >= m || mat[row][col] == 0 || visited[row][col]) {
            return;
        }

        // Mark the cell as visited
        visited[row][col] = true;

        // Explore all 8 directions
        int[] rowDir = {-1, -1, -1, 0, 0, 1, 1, 1}; // Row offsets
        int[] colDir = {-1, 0, 1, -1, 1, -1, 0, 1}; // Column offsets

        for (int d = 0; d < 8; d++) {
            dfs(mat, visited, row + rowDir[d], col + colDir[d], n, m);
        }
    }
}