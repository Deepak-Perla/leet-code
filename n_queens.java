class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        boolean[] rowCheck = new boolean[n];
        boolean[] diagonal1Check = new boolean[2*n-1];
        boolean[] diagonal2Check = new boolean[2*n-1];
        solveNQueensHelper(n, res, 0, board, rowCheck, diagonal1Check, diagonal2Check);
        return res;
    }
    
    private void solveNQueensHelper(int n, List<List<String>> res, int row, char[][] board, boolean[] rowCheck, boolean[] diagonal1Check, boolean[] diagonal2Check){
        
        if(row==n){
            List<String> subAns = new ArrayList<>();
            for(char[] string : board){
                // subAns.add(String.valueOf(string));
                subAns.add(new String(string));
            }
            res.add(subAns);
            return;
        }
        
        for(int col=0; col<n; col++){
            int pos1 = row + col;
            int pos2 = n-1 + row - col;
            
            if(!rowCheck[col] && !diagonal1Check[pos1] && !diagonal2Check[pos2]){
                
                rowCheck[col]=true;
                diagonal1Check[pos1] = true;
                diagonal2Check[pos2] = true;
                
                board[row][col] = 'Q';
                solveNQueensHelper(n, res, row+1, board, rowCheck, diagonal1Check, diagonal2Check);
                board[row][col] = '.';
                
                rowCheck[col]=false;
                diagonal1Check[pos1] = false;
                diagonal2Check[pos2] = false;
            }
            
        }
    }
}
