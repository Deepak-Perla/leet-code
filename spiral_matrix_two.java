class Solution {
    public int[][] generateMatrix(int n) {
        
        int res[][] = new int[n][n];
        
        int k=1,j=0,h=0;
        
        for(int i=0;i<=n/2;++i)
        {
            for(j=i;j<n-i;++j)    //left-right (forward)
            {
                res[i][j]=k++;
            }
            --j;
            for(h=i+1;h<n-i;++h)    //top-bottom (down)
            {
                res[h][j]=k++;
            }
            --h;
            for(j=j-1;j>=i;--j)    //right-left (left)
            {
                res[h][j]=k++;
            }
            ++j;
            for(h-=1;h>i;--h)    //bottom-top (up)
            {
                res[h][j]=k++;
            }
        }
        return res;
    }
}
