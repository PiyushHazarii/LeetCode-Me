// class Solution {
//     public void rotate(int[][] matrix) {
//         int n = matrix.length;
//         int ans[][] = new int[n][n];

//         // // here in this we just take one arr then fill it with 
//         // // like arr[j][n-1-i] because for matrix i == j and j == n-i-1
      
//         // for(int i=0;i<n;i++){
//         //     for(int j=0;j<n;j++){
//         //       ans[j][n-1-i] = matrix[i][j] ;
//         //     }
//         // }

//         // // in this it is accepted as 100 percent because the extra 
//         // // space is not considered as in and it goes into garbage collector
//         // for(int i=0;i<n;i++){
//         //     for(int j=0;j<n;j++){
//         //       matrix[i][j] = ans[i][j] ;
//         //     }
//         // }


//     }

// }



class Solution {
    public void swap(int matrix[][], int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;

    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // this is the transpose of the matrix 
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                swap(matrix,i,j);
            }
        }

        // here we reverse the row of the transpose of the matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp; 
            }
        }

    }
}