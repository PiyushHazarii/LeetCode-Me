class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        int top =0;
        int left =0;
        int right = n-1;
        int down = m-1;

        int count =0;
        while(top <= down && left <= right){
            if(count  == 0){
                for(int i=left; i<=right; i++){
                    list.add(matrix[top][i]);
                }
                top++;
            }
            if(count == 1){
                for(int i=top; i<=down; i++){
                    list.add(matrix[i][right]);
                }
                right--;
            }
            if(count == 2){
                for(int i=right; i >= left; i--){
                    list.add(matrix[down][i]);
                }
                down--;
            }
            if(count == 3){
                for(int i=down; i >= top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
            count = (count+1) % 4;
        }
        return list;
    }
}