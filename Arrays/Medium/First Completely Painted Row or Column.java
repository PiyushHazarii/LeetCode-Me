class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        Map<Integer, int[]> map = new HashMap<>();

        // we can add this to the map so that we can trace the
        // actual row and col so that we can find the actual 
        // index and return
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                map.put(mat[i][j], new int[]{i,j});
            }
            
        }

        int rowcount[] = new int[rows];
        int colcount[] = new int[cols];

        for(int i=0; i<arr.length; i++){
                int position[] = map.get(arr[i]);

                // this will give us the where to mark increment 
                // the row and col
                int r = position[0];
                int c = position[1];

                // this will increase the count of that exact row
                // and col 
                rowcount[r]++;
                colcount[c]++;

                // agar rowcount == cols hua aur agar colcount == row
                // hua to return i matlab mil gaya hai index
                if(rowcount[r] == cols || colcount[c] == rows){
                    return i;
                }
        }
        return -1;
    }
}