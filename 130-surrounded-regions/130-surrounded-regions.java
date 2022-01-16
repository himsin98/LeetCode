class Solution {
    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        for(int i = 0; i < row; i++)
        {
            if(board[i][0] == 'O')
                dfs(board,i,0,row,col);
        }
        for(int i = 0; i < row; i++)
        {
            if(board[i][col - 1] == 'O')
                dfs(board,i,col - 1,row,col);
        }   
        for(int j = 0; j < col; j++)
        {
            if(board[0][j] == 'O')
                dfs(board,0,j,row,col);
        }
        for(int j = 0; j < col; j++)
        {
            if(board[row - 1][j] == 'O')
                dfs(board,row - 1,j,row,col);
        }
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(board[i][j] == '1')
                    board[i][j] = 'O';
                else
                    board[i][j] = 'X';
            }
        }
    }
    private void dfs(char[][] board,int i,int j,int row,int col)
    {
        if(i < 0 || i >= row || j < 0 || j >= col || board[i][j] != 'O')
            return;
        board[i][j] = '1';
        dfs(board,i - 1,j,row,col);
        dfs(board,i + 1,j,row,col);
        dfs(board,i,j - 1,row,col);
        dfs(board,i,j + 1,row,col);
    }
}