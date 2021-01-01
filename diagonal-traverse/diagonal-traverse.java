class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0) return new int[0];
        int[] result = new int[matrix.length*matrix[0].length];
        int dir=1;
        int i =0, j=0;
        int col =matrix[0].length-1;
        int row= matrix.length-1;
        for(int k=0;k< matrix.length*matrix[0].length;k++){
            result[k] = matrix[i][j];
            if(dir==1){
                if(j== col){
                    dir =-1;
                    i++;
                }else if(i==0){
                    j++;dir=-1;
                }else{
                    i--;j++;
                }
            }else{
                if(i== row){
                    dir =1;
                    j++;
                }else if(j==0){
                    i++;dir=1;
                }else{
                    i++;j--;
                }
            }
        }
     return result;   
    }
}
