class Solution {
    public boolean exist(char[][] board, String word) {
        
        int m = board.length;
        int n = board[0].length;
        
        //-----------------OPTIMIZATIONS------------
        int[] wordCharFreq = new int['z'-'A'+1]; //A-Z and a-z
        int[] boardCharFreq = new int['z'-'A'+1];
        
        for(char c : word.toCharArray())
            wordCharFreq[c - 'A']++;
        
        for(int r = 0; r < m; r++)
            for(int c = 0; c < n; c++)
                boardCharFreq[board[r][c] - 'A']++;
        
        //check board has enough character occurances
        for(char c : word.toCharArray())
            if(boardCharFreq[c - 'A'] < wordCharFreq[c - 'A'])
                return false;
        
        //making more options at leaf level in te recursion tree
        if(boardCharFreq[word.charAt(0) - 'A'] > boardCharFreq[word.charAt(word.length()-1) - 'A']){
            char [] ca = new char[word.length()];
            for(int i = 0, j = word.length()-1; j >= 0; j--, i++)
                ca[i] = word.charAt(j);
            word = new String(ca);
        }
            
        //------------------------------------------
        
        for(int r = 0; r < m; r++)
            for(int c = 0; c < n; c++)
                if(backtrack(board, m, n, r, c, word, 0))
                    return true;
        
        return false;
    }
    
    private boolean backtrack(char[][] board, int m, int n, int r, int c, String word, int charIndx){
        
        if(word.length() == charIndx)
            return true;
        
        if(r < 0 || r >= m || c < 0 || c >= n)
            return false;
        
        if(board[r][c] != word.charAt(charIndx))
            return false;
        
        board[r][c] = '@'; //making visited by setting an invalid character
        
        if(backtrack(board, m, n, r, c+1, word, charIndx+1)
          || backtrack(board, m, n, r, c-1, word, charIndx+1)
          || backtrack(board, m, n, r+1, c, word, charIndx+1)
          || backtrack(board, m, n, r-1, c, word, charIndx+1))
            return true;
        
        board[r][c] = word.charAt(charIndx); //making as un-visited by restorng the chaacter back
        
        return false;
    }
}
