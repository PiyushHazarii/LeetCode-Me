
//  THIS IS THE BRUTE FORCE METHOD


class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] < 0)
                count++;
            }
        }
        return count;
    }
}

// this is the binary search approach  


class Solution {
    public int countNegatives(int[][] grid) {
        int key =0;
        int m = grid.length;
        int n = grid[0].length;
        int result =0;
        for(int []i : grid){
            int negative = firstNegative(i,key);

            result += n-negative;
        }
        return result;
    }
    public int firstNegative(int arr[], int key){
        int left =0;
        int right = arr.length;
        while(left < right){
            int mid = left + (right - left )/2;
            if(arr[mid] < key)
            right = mid;
            else 
            left = mid+1;
        }
        return left;
    }
}