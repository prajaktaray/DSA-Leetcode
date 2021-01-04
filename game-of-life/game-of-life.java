class Solution {
    public void gameOfLife(int[][] board) {
        if(board==null || board.length ==0)return;
        int row= board.length;
        int col= board[0].length;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int lives = getLives(i,j,board);
                if(board[i][j] == 1){
                    if(lives <2 ||lives >3 ) board[i][j] =9;
                } else{
                    if(lives ==3)board[i][j] =2;
                }
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(board[i][j] ==2) board[i][j] =1;
                if(board[i][j] ==9) board[i][j] =0;                
            }
        }              
    }
    private int getLives(int i,int j, int[][] board){
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{1,-1},{-1,1},{1,1}};
        int count =0;
        for(int[] dir:dirs){
            int r = i+dir[0];
            int c = j+dir[1];
            if((r>=0 && r< board.length) && (c >=0 && c<board[0].length)){
                if( board[r][c] ==1 || board[r][c] ==9) count++;
            }
        }
        return count;
    }
}
