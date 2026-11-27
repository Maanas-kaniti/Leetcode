class Solution {
    public boolean backtrack(char[][] board, String word, int i, int j, int k) {
        int m = board.length;
        int n = board[0].length;
        boolean left = false;
        boolean right = false;
        boolean down = false;
        boolean up = false;
        if (board[i][j] != word.charAt(k))
            return false;
        if (k == word.length()-1)
            return true;
        
        if (board[i][j] == word.charAt(k)) {
            char temp = board[i][j];
            board[i][j] = '#';
                if(j+1<=n-1 && board[i][j+1]!='#') left = backtrack(board, word, i, j + 1, k+1);
                if(j-1>=0 && board[i][j-1]!='#') right = backtrack(board, word, i, j - 1, k+1);
            if(i+1<=m-1 && board[i+1][j]!='#') down = backtrack(board, word, i + 1, j, k+1);
            if(i-1>=0 && board[i-1][j]!='#') up = backtrack(board, word, i - 1, j, k+1);
            board[i][j] = temp;
        }
        return up||left||right || down;
    }

    public boolean exist(char[][] board, String word) {
        boolean res = false;
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                     res = backtrack(board, word, i, j, 0);
                     if(res) return true;
                }
            }
        }
        return res;
    }
}