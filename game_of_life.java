class Solution {
public void gameOfLife(int[][] board) {

    int[][] temp = new int[board.length+2][board[0].length+2];
    
    for(int i=1;i<temp.length-1;i++)
    {
            for(int j=1;j<temp[0].length-1;j++)
        {
            temp[i][j] = board[i-1][j-1];
        }
    }
    for(int i=1;i<temp.length-1;i++)
    {
            for(int j=1;j<temp[0].length-1;j++)
        {
            int t = temp[i-1][j]+temp[i][j-1]+temp[i+1][j]+temp[i][j+1]+temp[i-1][j-1]+temp[i-1][j+1]+temp[i+1][j-1]+temp[i+1][j+1];
                if(board[i-1][j-1]==1)
                {
                    if(t<2)
                    {
                        board[i-1][j-1]=0;
                     
                    }
                    else if(t==2 || t==3)
                    {
                       board[i-1][j-1]=1;
                       
                    }
                    else if(t>3)
                    {
                        board[i-1][j-1]=0;
                        
                    }
                    
                }
                else{
                    if(t==3)
                        board[i-1][j-1]=1;
                       
                }      
        }
        
    }
    
}
}