class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null ||matrix.length ==0) return false;
        int row = 0;
        int col = matrix[0].length-1;
        
        while(col>=0 && row <  matrix.length){
            //1.    ==target
            if(matrix[row][col] == target) return true;            
            //2.    >target
            else if(matrix[row][col] > target) col--;            
            //3.    <target
            else row++;            
        }
        
        return false;
        
    }
}
