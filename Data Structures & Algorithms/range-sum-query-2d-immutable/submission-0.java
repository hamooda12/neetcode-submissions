class NumMatrix {
int [][]matrix;
    public NumMatrix(int[][] matrix) {
        this.matrix=matrix;
          for (int i = 0; i < matrix.length; i++) {
            int sum=0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum+=matrix[i][j];
               matrix[i][j]=sum;
                if(i==0)
                    continue;
                matrix[i][j]+= matrix[i-1][j];
            }

        } 
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int finalSum=matrix[row2][col2];
if(col1>0)
finalSum-=matrix[row2][col1-1];
if(row1>0)
finalSum-=matrix[row1-1][col2];
if(row1>0&&col1>0)
finalSum+=matrix[row1-1][col1-1];
return  finalSum;
    }
    
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */