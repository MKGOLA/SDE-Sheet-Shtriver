class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length,c=matrix[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                    int l=i,h=j;
                    for(int k=0;k<c;k++)
                    {   
                        if(matrix[l][k]==0)
                        continue;
                        matrix[l][k]=959595;   
                    }
                    for(int k=0;k<r;k++)
                    {
                         if(matrix[k][h]==0)
                        continue;
                        matrix[k][h]=959595;
                    }
                }
            }
        }
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                if(matrix[i][j]==959595)
                    matrix[i][j]=0;
    }
}
