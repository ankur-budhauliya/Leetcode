class Solution {
    public boolean exist(char[][] board, String word) {
        int n = word.length();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j< board[0].length; j++){
                if(helper(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean helper(char[][] board, String word, int r, int c, int idx){
        if (r < 0 || c < 0 || r >=board.length || c >= board[0].length)return false;
        if(board[r][c] != word.charAt(idx)) return false;
        if(idx == word.length()-1) return true;

        char temp = board[r][c];
        board[r][c] = '0';

        boolean found = helper(board, word,  r+1,  c, idx+1) ||//down
        helper(board, word,  r-1,  c,  idx+1) ||  //up
        helper(board, word,  r,  c+1,  idx+1) ||  //right
        helper(board, word,  r,  c-1,  idx+1);   //left

        board[r][c] = temp;

        return found;
        
    }
}
