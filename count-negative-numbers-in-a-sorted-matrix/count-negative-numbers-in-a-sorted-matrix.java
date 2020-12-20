class Solution {
    public int countNegatives(int[][] grid) {
        if(grid==null )return 0;
        int counter =0;
        for(int i = grid.length-1; i >=0;i--){
            for(int j=grid[0].length-1;j >=0;j--){
                //System.out.print(grid[i][j]);
                if(grid[i][j]>=0){                
                    break;
                }else counter++; 
            }
        }
        return counter;        
    }
}
