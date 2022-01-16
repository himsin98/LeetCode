class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] ans = new int[mat.length][mat[0].length];
      
      int row_min=0, row_max=0, col_min=0, col_max=0;
      
      for(int row=0; row<mat.length; row++){
          for(int col=0; col<mat[0].length; col++){
              
              if(row-k >= 0)
                row_min = row-k;
              else{
                int l;
                 for(l=0; l<=k; l++){
                     if(row - l == 0)
                         break;
                 }
                  row_min = row-l;
              }
                
              if(row+k < mat.length)
                row_max = row+k;
              else{
                  int l;
                  for(l=0; l<=k; l++){
                      if(row + l == mat.length-1)
                          break;
                  }
                  row_max = row+l;
              }
              
              if(col-k >= 0)
                col_min = col-k;
              else{
                  int l;
                  for(l=0; l<=k; l++){
                      if(col - l == 0)
                          break;
                  }
                  col_min = col-l;
              }
                
              if(col+k < mat[0].length)
                col_max = col+k;
              else{
                  int l;
                  for(l=0; l<=k; l++){
                      if(col + l == mat[0].length-1)
                          break;
                  }
                  col_max = col+l;
              }
              
              int sum = 0;  
              for(int i=row_min; i<=row_max; i++){
                  for(int j=col_min; j<=col_max; j++)
                      sum += mat[i][j];
              }
              ans[row][col] = sum;
          }
      }
        return ans;
    }
}