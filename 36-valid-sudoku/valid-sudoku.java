class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(Character.isDigit(board[i][j])){
                    if (!helper(i, j, board)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean helper(int i, int j, char[][] board) {
        char num = board[i][j];
        for (int k = 0; k < 9; k++) {
            if (board[i][k] == num && k != j) {
                return false;
            }
        }
        for (int l = 0; l < 9; l++) {
            if (board[l][j] == num && l != i) {
                return false;
            }
        }
        int a=i/3;
        int b=j/3;
        int row_start=a*3;
        int col_start=b*3;
        for(int c=row_start;c<row_start+3;c++){
            for(int d=col_start;d<col_start+3;d++){
                if(board[c][d]==num&&c!=i&&d!=j){
                    return false;
                }
            }
        }
        return true;
    }
}