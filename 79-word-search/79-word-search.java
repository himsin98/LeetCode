class Solution {
    public boolean exist(char[][] board, String word) {
        char[] wrd = word.toCharArray();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(prsnt(wrd,board,i,j,0)) return true;
            }
        }
        return false;
    }
    private boolean prsnt(char[] word, char[][] board, int x, int y, int i){
        if(i == word.length)   return true;
        if (y<0 || x<0 || x == board.length || y == board[x].length) return false;
        if(board[x][y] != word[i])  return false;
        board[x][y] ^= 256;
        boolean ans = prsnt(word,board,x+1,y,i+1) || prsnt(word,board,x-1,y,i+1) || prsnt(word,board,x,y+1,i+1) || prsnt(word,board,x,y-1,i+1);
        board[x][y] ^= 256;
        return ans;
    }
}