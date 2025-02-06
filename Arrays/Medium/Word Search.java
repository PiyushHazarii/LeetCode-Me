class Solution {
    // for traversing in the board bro in different directions
    int directions[][] = {{0,1},{1,0},{-1,0},{0,-1}};
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        int length = word.length();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(word.charAt(0) == board[i][j] && 
                findWord(board,i,j,word,0,length,m,n)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean findWord(char board[][], int i , int j, String word,
                                int index, int length, int m, int n){

        // agar index equal ho gaya length ke to iska matlab mil 
        // gaya hai wo word                            
        if(index == length){
            return true;
        }

        // agar koi bhi inme se sahi hoga to word nhi mila
        // iska matlab
        if(i<0 || i>=m || j<0 || j>=n || board[i][j] != word.charAt(index)){
            return false;
        }
        // yaha pr hum ye le rahe hai kyuki visited 
        // krna hai isko ki wapas se isme naa aaye ek loop mein

        char temp = board[i][j];
        board[i][j] = '#';

        for(int dir[] : directions){
            // yaha pr i ya to bhadega ya to ghatega to i ko plus 
            // krna must hai
            int newI = i+dir[0];
            int newJ = j+dir[1];

            if(findWord(board,newI,newJ,word,index+1,length, m, n)){
                return true;
            }
        }
        board[i][j] = temp;
        return false;
    }
}
