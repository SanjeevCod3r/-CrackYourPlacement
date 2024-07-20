package Day5;
class Solution {
    public int check(int[][] board, int r, int c){
       if(r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c]==0){
           return 0;
       }
       return 1;
    }
   public void gameOfLife(int[][] board) {
       int m = board.length;
       int n = board[0].length;
       int[][] temp = new int[m][n];

       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               int sum = check(board, i-1, j-1) + check(board, i+1, j+1) +
                        check(board, i-1, j) + check(board, i+1, j) +
                        check(board, i-1, j+1) + check(board, i+1, j-1) +
                        check(board, i, j+1) + check(board, i, j-1);

                        if(board[i][j]==1){
                           temp[i][j] = (sum<2 || sum>3) ? 0:1;
                        }
                        else{
                           temp[i][j] = (sum==3)?1:0;
                        }
           }
       }
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               board[i][j] = temp[i][j];
           }
       }
   }
}