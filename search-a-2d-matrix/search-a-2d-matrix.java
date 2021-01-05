class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0) return false;
        int row=0, col = matrix[0].length-1;
        //System.out.println(row);
        //System.out.println(col);
        //System.out.println(matrix.length);
        while(row < matrix.length){
            //System.out.println(matrix[row][col]);
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] < target) row++;
            else break;
        }
        if(row==matrix.length) return false;
        return binSearch(matrix, row,col,target);
        
    }
    
    private boolean binSearch(int[][] matrix,int row,int high,int target){
        int low =0;
        while(low<=high && high>=0 && low < matrix[0].length ){
            int mid = low + (high-low)/2;
            if(matrix[row][mid] == target) return true;
            else if(matrix[row][mid] < target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
}
