class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        for(int i=0; i<9; i++){
            Set<Character> set = new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[i][j] == '.'){
                    continue;
                }else if(set.contains(board[i][j])){
                    return false;
                }
                set.add(board[i][j]);
            }
        }


        for(int i=0; i<9; i++){
            Set<Character> set = new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[j][i] == '.'){
                    continue;
                }else if(set.contains(board[j][i])){
                    return false;
                }
                set.add(board[j][i]);
            }
        }

        for(int sr =0; sr<m; sr+=3){
            int er = sr + 2;
            for(int sc =0; sc<n; sc+=3){
                int ec = sc + 2;
                if(!traversal(board, sr, er, sc, ec)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean traversal(char board[][], int sr, int er,
                                int sc, int ec){
        Set<Character> set = new HashSet<>();
        for(int i=sr; i<=er; i++){
            for(int j=sc; j<=ec; j++){
                if(board[i][j] == '.'){
                    continue;
                }else if(set.contains(board[i][j])){
                    return false;
                }
                set.add(board[i][j]);
            }
        }
        return true;
    }
}